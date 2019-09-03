#!/bin/bash

# Accept parameters
HDFS_LOC=$1
MAIN_PATH=$2
FILE_INPUT_PATH=$3

DT=`date +'%m%d%Y'`
CONFIG_PATH=${MAIN_PATH}/config
LOG_PATH=${MAIN_PATH}/logs
OUTPUT_PATH=${MAIN_PATH}/output

# Variables Used
echo "LOG Path : " ${LOG_PATH} >> ${LOG_PATH}/log_flat_file_${DT}
echo "Input File Path : " ${FILE_INPUT_PATH} >> ${LOG_PATH}/log_flat_file_${DT}
echo "HDFS Location : " ${HDFS_LOC} >> ${LOG_PATH}/log_flat_file_${DT}

# Calculate next file instance in HDFS (if data ingested again in same day)
cat ${CONFIG_PATH}/tbls_file | while read tables
do
hadoop fs -mkdir -p $HDFS_LOC/${tables}_${DT}
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


echo "###############################################################################" >> ${LOG_PATH}/log_flat_file_${DT}
echo "Import Table: ${tables}" >> ${LOG_PATH}/log_flat_file_${DT}
echo "hdfs dfs -put ${FILE_INPUT_PATH}/${tables} $HDFS_LOC/${tables}_${DT}/${tables}_${CT}" >> ${LOG_PATH}/log_flat_file_${DT}
hdfs dfs -put ${FILE_INPUT_PATH}/${tables} $HDFS_LOC/${tables}_${DT}/${tables}_${CT}
echo "###############################################################################" >> ${LOG_PATH}/log_flat_file_${DT}


rm ${LOG_PATH}/tmp ${LOG_PATH}/tmp1
done

# Validate data ingestion
echo "File availability in HDFS" >> ${LOG_PATH}/log_flat_file_${DT}
cat ${CONFIG_PATH}/tbls_file | while read tables
do
hadoop fs -ls $HDFS_LOC/${tables}*  >> ${LOG_PATH}/log_flat_file_${DT}
done


