pass=$1
i=1000000

while [ $i -lt 2000001 ]
do
i=`expr $i + 1`
mysql -usuresh -p ${pass} << ! >> out
use customer;
insert into CLIENT values ($i,convert(`expr $i + 100`,char(32)),now(),'USA',now(),null,'First','Last','01/31/1985','IND','ERO','Y','1',1,'FED',now(),'FED',now());
insert into ALIAS values ($i,convert(`expr $i + 33`,char(32)),'First Long','Last Long',now(),null,1,'FED',now(),null,null);
insert into ADDRESS values ($i,convert(`expr $i + 5805`,char(32)),'Christ','cavalier',null,null,'Bunn','HI',convert(`expr 19701 + $i`,char(18)),'USA',now(),null,1,'FED',now(),null,null);
!
done
