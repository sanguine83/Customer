INPUT_DATA = LOAD '$HDFS_LOC' USING PigStorage(',') AS ( INTERNAL_ID:INT, CUSTOMER_ID:CHARARRAY, ACTIVE_SINCE_DT:CHARARRAY, COUNTRY:CHARARRAY, EFFECTIVE_DT:CHARARRAY, EXPIRY_DT:CHARARRAY, FIRST_NM:CHARARRAY, LAST_NM:CHARARRAY, DOB:CHARARRAY, COUNTRY_BRTH:CHARARRAY, CITY_BRTH:CHARARRAY, HIGH_NET:CHARARRAY, LOB_ID:CHARARRAY, VERIFY_STS:INT, VERIFY_BY:CHARARRAY, VERIFY_DT:CHARARRAY, CHANGE_BY:CHARARRAY, CHANGE_DT:CHARARRAY );
FILTER_DATA = FILTER INPUT_DATA BY VERIFY_STS == 1;
FILTER_DATA_OUT = FILTER INPUT_DATA BY VERIFY_STS != 1;
VALIDATE_DATE_1 = FOREACH FILTER_DATA GENERATE INTERNAL_ID , CUSTOMER_ID , SUBSTRING(ACTIVE_SINCE_DT,0,19) AS ACT_DT , COUNTRY , ToDate(SUBSTRING(EFFECTIVE_DT,0,19), 'yyyy-MM-dd HH:mm:ss') AS (EFF_DT:DATETIME), SUBSTRING(EXPIRY_DT,0,19) AS EXP_DT , FIRST_NM , LAST_NM , SUBSTRING(DOB,0,19) AS BT_DT , COUNTRY_BRTH , CITY_BRTH , HIGH_NET , LOB_ID , VERIFY_STS , VERIFY_BY  ,SUBSTRING( VERIFY_DT,0,19) AS VF_DT, CHANGE_BY ,SUBSTRING( CHANGE_DT,0,19)  AS CH_DT;
VALIDATE_DATE_2 = FILTER VALIDATE_DATE_1 BY DaysBetween(EFF_DT,(datetime)ToDate('1799-09-01','yyyy-MM-dd')) >= (long)0;
VALIDATE_DATE_2_OUT = FILTER VALIDATE_DATE_1 BY DaysBetween(EFF_DT,(datetime)ToDate('1799-09-01','yyyy-MM-dd')) < (long)0;
OUTPUT_DATA = FOREACH VALIDATE_DATE_2 {
  year = (chararray)SPRINTF('%04d',GetYear(EFF_DT));
  month = (chararray)SPRINTF('%02d',GetMonth(EFF_DT));
  day = (chararray)SPRINTF('%02d',GetDay(EFF_DT));
  hour = (chararray)SPRINTF('%02d',GetHour(EFF_DT));
  min = (chararray)SPRINTF('%02d',GetMinute(EFF_DT));
  sec = (chararray)SPRINTF('%02d',GetSecond(EFF_DT)); 
GENERATE INTERNAL_ID , CUSTOMER_ID , ACT_DT , COUNTRY , CONCAT(CONCAT(CONCAT(CONCAT(CONCAT(CONCAT(year, '-'), CONCAT(month, '-')), CONCAT(day,' ')), CONCAT(hour,':')), CONCAT(min,':')), sec) as CONV_DATE, EXP_DT , FIRST_NM , LAST_NM , BT_DT , COUNTRY_BRTH , CITY_BRTH , HIGH_NET , LOB_ID , VERIFY_STS ,VERIFY_BY,VF_DT , CHANGE_BY , CH_DT ;}
OUTPUT_DATA_OUT = FOREACH VALIDATE_DATE_2_OUT {
  year = (chararray)SPRINTF('%04d',GetYear(EFF_DT));
  month = (chararray)SPRINTF('%02d',GetMonth(EFF_DT));
  day = (chararray)SPRINTF('%02d',GetDay(EFF_DT));
  hour = (chararray)SPRINTF('%02d',GetHour(EFF_DT));
  min = (chararray)SPRINTF('%02d',GetMinute(EFF_DT));
  sec = (chararray)SPRINTF('%02d',GetSecond(EFF_DT));
GENERATE INTERNAL_ID , CUSTOMER_ID , ACT_DT , COUNTRY , CONCAT(CONCAT(CONCAT(CONCAT(CONCAT(CONCAT(year, '-'), CONCAT(month, '-')), CONCAT(day,' ')), CONCAT(hour,':')), CONCAT(min,':')), sec) as CONV_DATE, EXP_DT , FIRST_NM , LAST_NM , BT_DT , COUNTRY_BRTH , CITY_BRTH , HIGH_NET , LOB_ID , VERIFY_STS ,VERIFY_BY,VF_DT , CHANGE_BY , CH_DT ;}
REJECT_DATA = UNION FILTER_DATA_OUT,OUTPUT_DATA_OUT;
STORE OUTPUT_DATA INTO '$HDFS_LOC_VAL';
STORE REJECT_DATA INTO '$HDFS_LOC_REJECT';
