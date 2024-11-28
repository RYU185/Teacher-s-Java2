-- 함수5_집계함수.sql

use testdb;

-- count 데이터 개수를 세는 함수(null은 제외)
select count(*), count(고객번호), count(도시), count(지역)
from 고객;

-- sum 합계
-- avg 평균
-- min 최소값
-- max 최대값
select sum(마일리지), avg(마일리지), min(마일리지), max(마일리지)
from 고객;







