pass=$1
i=0
while [ $i -lt 9999 ]
do
i=`expr $i + 1`
mysql -usuresh -p ${pass} << ! >> out
use customer;
insert into house (num) values ($i);
!
done

