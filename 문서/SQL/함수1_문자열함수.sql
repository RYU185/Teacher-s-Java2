-- 함수1_문자열함수.sql

use testdb;

-- char_length 문자의 갯수
-- length 바이트 수
select char_length('hello'); -- 5 
select length('hello');  -- 5
select char_length('안녕'), length('안녕'); -- 2 6 

-- concat 문자열 연결
-- concat_ws 문자열을 구분자와 함께 연결 (ws = with separator)
select concat('꿈은 ', '이루어진다');
select concat_ws('-', '2024', '11', '27');

-- left 문자열의 왼쪽부터 몇개
-- right 문자열의 오른쪽부터 몇개
-- substr 문자열의 몇번째부터 몇개
select left('SQL 공부', 3),
		right('SQL 공부', 2),
		substr('SQL 공부', 3, 4),
		substr('SQL 공부', 5); 




















