pass=$1
i=1

while [ $i -lt 46 ]
do
i=`expr $i + 1`
mysql -usuresh -p ${pass} << ! >> out
use customer;
update zip set OID=OID+43582 ;
UPDATE ADDRESS a,zip s SET a.city = s.city ,a.STATE = s.abrev,a.post_code=s.zip where a.OID = s.OID;
!
done
