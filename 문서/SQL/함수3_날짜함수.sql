-- 함수3_날짜함수.sql

use testdb;

-- now 현재 날짜와 시간
-- sysdate 현재 시스템의 날짜와 시간 (now와 대부분 동일)
-- curdate 현재 날짜
-- curtime 현재 시간
select now(), sysdate(), curdate(), curtime();   

-- year(년), quarter(분기), month(월), day(일), hour(시), minute(분), second(초)
select year(now()),
		quarter(now()),
		month(now()),
		day(now()),
		hour(now()),
		minute(now()),
		second(now());
	
-- datediff 날짜간의 일수 차이
-- timestampdiff 두 날자의 시간을 기준시간으로 변환하여 계산하고 다시 날짜로 변환함
select datediff('2024-12-25', now()); -- 28
select datediff(now(), '2024-12-25'); -- -28
select abs(datediff(now(), '2024-12-25')); -- 28
select timestampdiff(year, now(), '2025-12-25'); -- 1
select timestampdiff(month, now(), '2025-12-25'); -- 12
select timestampdiff(day, now(), '2025-12-25'); -- 392
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	