
# Accept parameters
HDFS_ING_STAGE=$1
HDFS_LOC=$2
mysql_user=$3
mysql_host=$4
mysql_db=$5
MAIN_PATH=$6

DT=`date +'%m%d%Y'`
DT_DAILY=`date +'%Y-%m-%d'`
CONFIG_PATH=${MAIN_PATH}/config
LOG_PATH=${MAIN_PATH}/logs
OUTPUT_PATH=${MAIN_PATH}/output

# Fetching DB password from HDFS
mysql_pwd=`hdfs dfs -cat /user/hduser/Project/Ingest/mysql_db_pwd`

# Variables Used
echo "LOG Path : " ${LOG_PATH} >> ${LOG_PATH}/log_${DT}
echo "HDFS Location : " ${HDFS_LOC} >> ${LOG_PATH}/log_${DT}

# Calculate next file instance in HDFS (if data ingested again in same day)
cat ${CONFIG_PATH}/tbls | while read tables
do
hadoop fs -ls ${HDFS_LOC}/${tables}_${DT}/* > ${LOG_PATH}/tmp
CT=0
CT_CH=0
CT_MAX=0
echo "0" > ${LOG_PATH}/tmp1

cat ${LOG_PATH}/tmp | while read file
do
CT_MAX=`cat ${LOG_PATH}/tmp1`
CT_CH=`echo ${file} | cut -d"_" -f3`
if [ ${CT_MAX} -le ${CT_CH} ] ; then
CT_MAX=${CT_CH}
rm ${LOG_PATH}/tmp1
echo $CT_MAX > ${LOG_PATH}/tmp1
fi
done


CT_MAX=`cat ${LOG_PATH}/tmp1`
CT=`expr ${CT_MAX} + 1`

echo "###############################################################################" >> ${LOG_PATH}/log_${DT}
echo "Import Table: ${tables}"  >> ${LOG_PATH}/log_${DT}
echo "sqoop import --connect jdbc:mysql://${mysql_host}/${mysql_db} --username ${mysql_user} --password XXXXX --query \"select * from ${tables} where CHANGE_DT > '${DT_DAILY}' AND \$CONDITIONS\" --target-dir ${HDFS_ING_STAGE}/$tables --outdir ${OUTPUT_PATH} -m 1 --bindir ./" >> ${LOG_PATH}/log_${DT}
sqoop import --connect jdbc:mysql://${mysql_host}/${mysql_db}?zeroDateTimeBehavior=convertToNull --username ${mysql_user} --password ${mysql_pwd} --query "select * from ${tables} where CHANGE_DT > '${DT_DAILY}' AND \$CONDITIONS" --target-dir ${HDFS_ING_STAGE}/$tables --outdir ${OUTPUT_PATH} -m 1 --bindir ./
echo "###############################################################################" >> ${LOG_PATH}/log_${DT}

if [ $CT -eq 1 ]; then
hadoop fs -mkdir -p $HDFS_LOC/${tables}_${DT}
fi

# Consolidate and Clean up files after ingestion
hadoop fs -rm -r $HDFS_ING_STAGE/$tables/_SUCCESS
hadoop fs -cat $HDFS_ING_STAGE/$tables/part* | hadoop fs -put - $HDFS_ING_STAGE/$tables/${tables}_${CT}
hadoop fs -cp $HDFS_ING_STAGE/$tables/${tables}_${CT} $HDFS_LOC/${tables}_${DT}/
hadoop fs -rm -R $HDFS_ING_STAGE
rm ${LOG_PATH}/tmp ${LOG_PATH}/tmp1
mv $tables.* ${OUTPUT_PATH}/
mv QueryResult.* ${OUTPUT_PATH}/
done

# Validate data ingestion
echo "Validation in HDFS"
cat ${CONFIG_PATH}/tbls | while read tables
do
hadoop fs -ls $HDFS_LOC/${tables}* >> ${LOG_PATH}/log_${DT}
done


