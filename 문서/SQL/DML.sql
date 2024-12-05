-- DML.sql

use testdb;

-- # insert into 테이블명 values(값1, 값2, ....);
-- 전체 행을 기록하는 경우
insert into 부서 values('A5', '마케팅부'); -- 컬럼순서대로 작성

insert into 제품 values(91, '연어피클소스', null, 5000, 40);

-- 컬럼명을 지정해서 기록하는 경우
insert into 제품(제품번호, 제품명) values(92, '삼양짱구');

-- 여러 행의 데이터를 한번에 입력
insert into 사원(사원번호, 이름, 직위, 성별, 입사일)
	values('E20', '김사과', '수습사원', '남', curdate()),
		  ('E21', '박딸기', '수습사원', '여', curdate()),
		  ('E22', '정오렌지', '수습사원', '여', curdate());







