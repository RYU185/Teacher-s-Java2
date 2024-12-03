-- 쿼리3_CTE.sql
use testdb;

-- CTE(Common Table Expression)
-- 임시결과 집합을 정의하여 쿼리에서 재사용할수 있는 기능
-- WITH 키워드를 사용
-- 조인쿼리나 서브쿼리와 완전히 다른 형태라기보다 복잡한 쿼리를 가독성과 재사용성을 
-- 용이하게 만든 표현방식
-- 조인쿼리와 서브쿼리의 단점을 보완하는 도구!!
/* 언제 사용하는가??
1) 복잡한 서브쿼리를 대체
2) 동일 서브쿼리를 여러번 사용할 경우, 중복쿼리를 대체
3) 쿼리의 가독성을 높이고 싶을때
*/

-- 서브쿼리의 중복
select 고객.고객번호, 고객회사명, (
	select sum(단가*주문수량) from 주문세부
	join 주문 on 주문세부.주문번호 = 주문.주문번호
	where 주문.고객번호 = 고객.고객번호
) as 총주문액
from 고객;

select 고객.고객번호, 담당자명, 담당자직위, (
	select sum(단가*주문수량) from 주문세부
	join 주문 on 주문세부.주문번호 = 주문.주문번호
	where 주문.고객번호 = 고객.고객번호
) as 총주문액
from 고객;

-- 위 서브쿼리의 중복을 CTE로 해결
with 주문총액 as (
	select 주문.고객번호, sum(단가*주문수량) as 총주문액
	from 주문
	join 주문세부 on 주문.주문번호 = 주문세부.주문번호
	group by 주문.고객번호
)
select 고객.고객번호, 고객회사명, 주문총액.총주문액
from 고객
join 주문총액 on 고객.고객번호 = 주문총액.고객번호;
select 고객.고객번호, 담당자명, 담당자직위, 주문총액.총주문액
from 고객
join 주문총액 on 고객.고객번호 = 주문총액.고객번호;
















