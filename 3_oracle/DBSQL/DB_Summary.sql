--06/10
-- * Data Integrity Rule(데이터 무결성) * 

--248
--무결성 제약조건: 테이블에 부적절한 자료가 입력되는 것을 방지하기 위해서 테이블 생성할 때
--             각 컬럼에 대해서 정의하는 여러 규칙. 다른 말로 정확성

--1. 무결성 제약조건 6가지
 --not null: 반드시 값을 가져야 한다. 
 --unique: 중복 불가, NULL 불가 
 --primary key: 중복 불가, null 불가
 --Foreign key: 중복 가능, null 허용, 범위(domain)
 --             다른 테이블(부모)의 기본키를 현 테이블의 컬럼으로 사용
 --Check: 범위, 조건값
 --default: 기본값 
 
 

--index -> non-unique, unique
--key-> unique, primary, foreign


--계정: SCOTT -------------------------------------------------------------------
--1. not null
select * from dept; --describe의 축약 
desc dept;
insert into dept values(50, 'test', 'seoul');
insert into dept values(null, null, 'seoul');

drop table emp01;

create table emp01(
empno number(4),
ename varchar2(10),
job varchar2(9),
deptno number(2)
);

insert into emp01 values(null, null, 'sales', 30);

create table emp02(
empno number(4) not null,
ename varchar2(10) not null,
job varchar2(9),
deptno number(2)
);

insert into emp02 values(null, null, 'sales', 30);
---> NULL을 *("SCOTT"."EMP02"."EMPNO")안에 삽입할 수 없습니다. 

insert into emp02 values(20, 'Hong', 'sales', 30);

--2. unique: null허용 
create table emp03(
empno number(4) unique,
ename varchar2(10) not null,
job varchar2(9),
deptno number(2)
);
insert into emp03 values(null, 'Hong', 'sales', 30); --null허용 
insert into emp03 values(10, 'Hong', 'sales', 30); --O
insert into emp03 values(10, 'Hong', 'sales', 30); --X(중복값) 
---> ORA-00001: 무결성 제약조건(SCOTT.SYS_c0011067)에 위배됩니다. 

--3. Primary Key: Unique + null 불가 
create table emp05(
empno number(4) CONSTRAINT emp05_empno_pk primary key,
ename varchar2(10) Constraint emp05_ename_nn not null,
job varchar2(9),
deptno number(2)
);
insert into emp05 values(null, 'Hong', 'sales', 30); --null 불가 
insert into emp05 values(10, 'Hong', 'sales', 30); --O
insert into emp05 values(10, 'Hong', 'sales', 30); --X(중복값) 
---> ORA-00001: 무결성 제약조건(SCOTT.EMP05_EMPNO_PK)에 위배됩니다. 

select constraint_name, constraint_type, table_name
from user_constraints
where table_name IN ('EMP05');

create table emp055(
empno number(4) primary key,
ename varchar2(10) not null,
job varchar2(9),
deptno number(2)
);

select constraint_name, constraint_type, table_name
from user_constraints
where table_name IN ('EMP055');
