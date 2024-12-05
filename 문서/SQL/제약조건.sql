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

create table 학과
(학과번호 char(2) primary key,
학과명 varchar(20) not null,
학과장명 varchar(20));

insert into 학과 values('AA', '컴퓨터공학', '김교수');
insert into 학과 values('BB', '디자인학과', null);

create table 학생
(학번 char(5) primary key,
이름 varchar(20) not null,
생일 date not null,
연락처 varchar(20) unique,
성별 char(1) not null check(성별 in ('남', '여')),
등록일 date default(curdate()));

insert into 학생(학번, 이름, 생일, 연락처, 성별)
values('S0001', 'Steve', '2000-01-01', '010-2222-3333', '남');
insert into 학생(학번, 이름, 생일, 연락처, 성별)
values('S0002', 'Tom', '2000-01-01', '010-4444-5555', '남');









