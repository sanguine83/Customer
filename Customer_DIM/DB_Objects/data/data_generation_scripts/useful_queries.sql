SELECT TABLE_NAME AS "Table", round(((data_length + index_length) / 1024 / 1024), 2) AS Size_in_MB FROM information_schema.TABLES WHERE table_schema = 'customer' ORDER BY Size_in_MB DESC; 

UPDATE CLIENT c, TEST t SET FIRST_NM = FIRST , LAST_NM = LAST WHERE c.OID = t.OID AND c.OID BETWEEN 800001 AND 1000000;

SELECT * FROM ADDRESS INTO OUTFILE '/tmp/d' ;

UPDATE CLIENT SET FIRST_NM  = "Michael" , LAST_NM = "Jackson"  WHERE RAND() < 0.5;
