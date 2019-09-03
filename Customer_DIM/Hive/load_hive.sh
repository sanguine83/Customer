#!/bin/bash

DT=`date +'%m%d%Y'`

# Set paths
MAIN_PATH="$( cd "$(dirname "$0")" ; pwd -P )"
HQL_PATH=${MAIN_PATH}/hql
CONFIG_PATH=${MAIN_PATH}/config
LOG_PATH=${MAIN_PATH}/logs
rm ${LOG_PATH}/log_${DT}

# Read configuration details
while read config_item value
do
export "$config_item"="$value"
done < ${CONFIG_PATH}/configuration

# Load the validated file to HIVE
cat ${CONFIG_PATH}/tbls | while read tables
do
echo `date` >> ${LOG_PATH}/log_${DT}
hdfs dfs -ls ${HDFS_LOC_STAGE}/${tables}* > ${LOG_PATH}/file_list
cat ${LOG_PATH}/file_list >> ${LOG_PATH}/log_${DT}
cat ${LOG_PATH}/file_list | while read file
do
PROCESSING_DT=`echo $file | cut -d"_" -f4`
CT=`echo $file | cut -d"_" -f3`
PARTITION_CHECK=`hdfs dfs -test -d ${HIVE_FILE_PATH}/${tables}/load_dt=${PROCESSING_DT} && echo '0' || echo '1'`
if [ $PARTITION_CHECK -eq 0 ]; then
echo "hdfs dfs -cp ${HDFS_LOC_STAGE}/${tables}_${CT}_${PROCESSING_DT} ${HIVE_FILE_PATH}/${tables}/load_dt=$PROCESSING_DT/${tables}_${CT}_${PROCESSING_DT}" >> ${LOG_PATH}/log_${DT}
hdfs dfs -cp ${HDFS_LOC_STAGE}/${tables}_${CT}_${PROCESSING_DT} ${HIVE_FILE_PATH}/${tables}/load_dt=$PROCESSING_DT/${tables}_${CT}_${PROCESSING_DT}
else
echo '"hive -e "LOAD DATA INPATH '${HDFS_LOC_STAGE}/${tables}_${CT}_${PROCESSING_DT}' INTO TABLE '${HIVE_DB}.${tables}' PARTITION(LOAD_DT='$PROCESSING_DT');"' >> ${LOG_PATH}/log_${DT}
hive -e "LOAD DATA INPATH '${HDFS_LOC_STAGE}/${tables}_${CT}_${PROCESSING_DT}' INTO TABLE ${HIVE_DB}.${tables} PARTITION(LOAD_DT='$PROCESSING_DT');"
fi
done
rm ${LOG_PATH}/file_list
done
mv ${MAIN_PATH}/derby.log ${LOG_PATH}
