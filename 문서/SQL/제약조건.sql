-- 제약조건.sql

/* 데이터베이스에는 무결점의 데이터가 필수(= 무결성의 원칙)
테이블에 아무런 제약사항을 두지 않으면 적합하지 않은 데이터가 저장되고
그렇게되면 무결성의 원칙에 위배됨!
반드시 제약조건을 설정해야하는 이유임 */

create database test2
	char set utf8mb4 collate utf8mb4_general_ci;

use test2;

/* 제약조건의 종류
primary key : 기본키, PK
not null : 반드시 값이 필수
unique : 유일한 값 보장
check : 설정된 조건에 맞는 값만 저장
default : 값을 안넣으면 자동으로 기본값을 저장
foreign key : 외래키, FK
 */









