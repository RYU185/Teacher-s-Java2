-- 쿼리1_조인쿼리.sql

use testdb;

/* 조인(join)이란, 두개 이상의 테이블을 연결하여 데이터를 검색하는 방법
<조인(join)의 종류>
cross join 크로스조인
inner join 이너조인(내부조인)
outer join 아우터조인(외부조인)
self join 셀프조인
*/

-- cross join 크로스조인
select 이름, 부서.부서번호, 부서명
from 사원
cross join 부서;
-- 부서번호는 사원테이블과 부서테이블 양쪽에 모두 존재하므로 명식적으로 테이블이름.컬럼명 형태가 필요!!
















