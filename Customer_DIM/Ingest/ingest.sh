#!/bin/bash

load_type=$1
DT=`date +'%m%d%Y'`

# Set paths
MAIN_PATH="$( cd "$(dirname "$0")" ; pwd -P )"
SCRIPT_PATH=${MAIN_PATH}/scripts
CONFIG_PATH=${MAIN_PATH}/config
LOG_PATH=${MAIN_PATH}/logs

# Read configuration details
while read config_item value
do
export "$config_item"="$value"
done < ${CONFIG_PATH}/configuration

if [ "${load_type}" == "FULL" ] ; then
# Clean up old logs
rm ${LOG_PATH}/log_${DT}
echo "Calling Full ingestion script"  >> ${LOG_PATH}/log_${DT}
${SCRIPT_PATH}/db_ingest_full.sh ${HDFS_ING_STAGE} ${HDFS_LOC} ${mysql_user} ${mysql_host} ${mysql_db} ${MAIN_PATH}
elif [ "${load_type}" == "FILE" ] ; then
# Clean up old logs
rm ${LOG_PATH}/log_flat_file_${DT}
echo "Calling File ingestion script"  >> ${LOG_PATH}/log_flat_file_${DT}
${SCRIPT_PATH}/file_import.sh ${HDFS_LOC} ${MAIN_PATH} ${FILE_INPUT_PATH}
elif [ "${load_type}" == "DAILY" ] ; then
# Clean up old logs
rm ${LOG_PATH}/log_${DT}
echo "Calling Delta ingestion script"  >> ${LOG_PATH}/log_${DT}
${SCRIPT_PATH}/db_ingest_daily.sh ${HDFS_ING_STAGE} ${HDFS_LOC} ${mysql_user} ${mysql_host} ${mysql_db} ${MAIN_PATH}
fi

