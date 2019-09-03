use customer;
create	table	CLIENT
(
INTERNAL_ID			numeric(20,0)	null,
CUSTOMER_ID		varchar(32)	null,
ACTIVE_SINCE_DT		datetime	null,
COUNTRY	varchar(3)	null,
EFFECTIVE_DT		datetime	null,
EXPIRY_DT		datetime	null,
FIRST_NM		varchar(39)	null,
LAST_NM			varchar(39)	null,
DOB		datetime	null,
COUNTRY_BRTH		varchar(3)	null,
CITY_BRTH		varchar(20)	null,
HIGH_NET		varchar(1)	null,
LOB_ID			varchar(20)	null,
VERIFY_STS		tinyint		null,
VERIFY_BY	varchar(20)	null,
VERIFY_DT	datetime	null,
CHANGE_BY	varchar(20)	null,
CHANGE_DT	datetime	null
);

create unique index CLIENT_PK on CLIENT(INTERNAL_ID);

create table ALTERNATE
(
INTERNAL_ID			numeric(20,0)	null,
ALT_ID		varchar(20)	null,
ALT_LONG_NM		varchar(80)	null,
ALT_SHORT_NM		varchar(40)	null,
EFFECTIVE_DT		datetime	null,
EXPIRY_DT		datetime	null,
VERIFY_STS		tinyint		null,
VERIFIED_BY varchar(20)	null,
VERIFIED_DT datetime	null,
CHANGE_BY			varchar(20)	null,
CHANGE_DT			datetime	null
);

create unique index ALT_PK on ALTERNATE(INTERNAL_ID);

create table ADDRESS
(
INTERNAL_ID			numeric(20,0)	null,
ADDR_LN_1		varchar(70)	null,
ADDR_LN_2               varchar(70)     null,
ADDR_LN_3               varchar(70)     null,
ADDR_LN_4               varchar(70)     null,
ADDR_LN_5               varchar(70)     null,
CITY			varchar(20)	null,
STATE			varchar(20)	null,
POST_CODE		varchar(18)	null,
COUNTRY_CODE		varchar(3)	null,
EFFECTIVE_DT		datetime	null,
EXPIRY_DT		datetime	null,
VERIFY_STS		tinyint		null,
VERIFIED_BY		varchar(20)	null,
VERIFIED_DT		datetime	null,
CHANGE_BY			varchar(20)	null,
CHANGE_DT			datetime	null
);

create unique index ADDRESS_PK on ADDRESS(INTERNAL_ID);


