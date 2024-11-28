-- 함수5_집계함수.sql

use testdb;

-- count 데이터 개수를 세는 함수(null은 제외)
select count(*), count(고객번호), count(도시), count(지역)
from 고객;