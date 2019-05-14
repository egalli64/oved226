select sysdate
from dual;

SELECT 6 * 3
FROM dual;

select *
from regions;

select region_name
from regions;

select region_name
from regions
where region_id = 1;

select rowid, rownum
from regions;

select table_name
from user_tables;

describe jobs;

select column_name, nullable, data_type, data_length, data_precision, data_scale
from user_tab_columns
where table_name = 'JOBS';


