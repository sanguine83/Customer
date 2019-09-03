#!/bin/bash

########################################################################################
# Script to validate ingested data
########################################################################################

DT=`date +'%m%d%Y'`

# Set paths
MAIN_PATH="$( cd "$(dirname "$0")" ; pwd -P )"
SCRIPT_PATH=${MAIN_PATH}/modules
CONFIG_PATH=${MAIN_PATH}/config
LOG_PATH=${MAIN_PATH}/logs
rm ${LOG_PATH}/log_${DT}

# Read configuration details
while read config_item value
do
export "$config_item"="$value"
done < ${CONFIG_PATH}/configuration

cat ${CONFIG_PATH}/tbls | while read tables
do

echo `date` >>  ${LOG_PATH}/log_${DT}
# Calculate next file instance in HDFS (if data ingested again in same day)
hdfs dfs -ls ${HDFS_LOC_VAL}/${tables}_${DT}/* > ${LOG_PATH}/tmp
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

hdfs dfs -ls ${HDFS_LOC_Reject}/${tables}_${DT}/* > ${LOG_PATH}/tmpr
CTR=0
CT_CHR=0
CT_MAXR=0
echo "0" > ${LOG_PATH}/tmp1r
cat ${LOG_PATH}/tmpr | while read file
do
CT_MAXR=`cat ${LOG_PATH}/tmp1`
CT_CHR=`echo ${file} | cut -d"_" -f3`
if [ ${CT_MAXR} -le ${CT_CHR} ] ; then
CT_MAXR=${CT_CHR}
rm ${LOG_PATH}/tmp1r
echo $CT_MAXR > ${LOG_PATH}/tmp1r
fi
done
CT_MAXR=`cat ${LOG_PATH}/tmp1r`
CTR=`expr ${CT_MAXR} + 1`


echo "###############################################################################" >> ${LOG_PATH}/log_${DT}
echo "Validate Table: ${tables}" >> ${LOG_PATH}/log_${DT}
echo "pig -f ${SCRIPT_PATH}/Validate_${tables}.pig -param HDFS_LOC_VAL=${HDFS_VAL_STAGE} -param HDFS_LOC=${HDFS_LOC}/${tables}_${DT}/${tables}_${CT} -param HDFS_LOC_REJECT=$HDFS_VAL_STAGE_R" >> ${LOG_PATH}/log_${DT}
pig -f ${SCRIPT_PATH}/Validate_${tables}.pig -param HDFS_LOC_VAL=${HDFS_VAL_STAGE} -param HDFS_LOC=${HDFS_LOC}/${tables}_${DT}/${tables}_${CT} -param HDFS_LOC_REJECT=$HDFS_VAL_STAGE_R
echo "###############################################################################" >> ${LOG_PATH}/log_${DT}


if [ $CT -eq 1 ]; then
hdfs dfs -mkdir -p $HDFS_LOC_VAL/${tables}_${DT}
fi
if [ $CTR -eq 1 ]; then
hdfs dfs -mkdir -p $HDFS_LOC_REJECT/${tables}_${DT}
fi

# Consolidate and Clean up files after validation
hdfs dfs -rm -r $HDFS_VAL_STAGE/_SUCCESS
hdfs dfs -rm -r $HDFS_VAL_STAGE_R/_SUCCESS
hdfs dfs -cat $HDFS_VAL_STAGE/part* | hdfs dfs -put - $HDFS_VAL_STAGE/${tables}_${CT}
hdfs dfs -cp $HDFS_VAL_STAGE/${tables}_${CT} $HDFS_LOC_VAL/${tables}_${DT}/
hdfs dfs -cat $HDFS_VAL_STAGE_R/part* | hdfs dfs -put - $HDFS_VAL_STAGE_R/${tables}_${CT}
hdfs dfs -cp $HDFS_VAL_STAGE_R/${tables}_${CT} $HDFS_LOC_REJECT/${tables}_${DT}/
hdfs dfs -rm -R $HDFS_VAL_STAGE
hdfs dfs -rm -R $HDFS_VAL_STAGE_R


# Moving files to HIVE Table location
hdfs dfs -cp $HDFS_LOC_VAL/${tables}_${DT}/${tables}_${CT} ${HDFS_LOC_STAGE}/${tables}_${CT}_${DT}
rm ${LOG_PATH}/tmp*
done

echo "File availability in HDFS" >> ${LOG_PATH}/log_${DT}
cat ${CONFIG_PATH}/tbls | while read tables
do
hdfs dfs -ls $HDFS_LOC_VAL/${tables}* >> ${LOG_PATH}/log_${DT}
done

echo "Reject File availability in HDFS" >> ${LOG_PATH}/log_${DT}
cat ${CONFIG_PATH}/tbls | while read tables
do
hdfs dfs -ls $HDFS_LOC_REJECT/${tables}* >> ${LOG_PATH}/log_${DT}
done

mv ${MAIN_PATH}/pig* ${LOG_PATH}/
