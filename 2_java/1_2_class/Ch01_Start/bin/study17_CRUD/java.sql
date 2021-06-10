--java/java

create table member1(
	id varchar2(12),
	pw varchar2(12),
	age number,
	addr varchar2(50),
	email varchar2(30)
	);
	
	
--3. Index
--SQL 문의 처리 속도를 향상시키기 위해서 
insert into member1 values('aaa','aaa','홍길동','서울시', 22,'a@a.com');

select * from;

select index_name, table_name, column_name
from USER_IND_COLUMNS
where table_name IN('ENP', 'DEPT');

--ex. SCOTT 계정 

--1) 인덱스 비교
--i) emp 테이블 복사 

drop tabel emp01;
create table emp01
as
select * from emp;

select * from emp01;
select * from emp;

select index_name, table_name, column_name
from USER_IND_COLUMNS
where table_name IN('ENP', 'EMP01');
--=> subQuery 복사한 테이블(emp01)은 구조와 내용만 복사될 뿐
--Index, 제약조건은 복사 불가 

--ii)인덱스가 아닌 컬럼으로 검색하기
insert into emp01 select * from emp01;
insert into emp01 select * from emp01;
insert into emp01 select * from emp01;
insert into emp01 select * from emp01;
insert into emp01 select * from emp01;
insert into emp01 select * from emp01;

--실행
insert into emp01(empno, ename) values(1111, 'aaaa');
set timing on --실행시킨 SQL 또는 PLSQL 블록에 실행 속도를 보기 위한 것 
--실행시: F5(스크립트 실행)
select distinct empno, ename from emp01 where ename='aaaa';

--iii)인덱스를 사용한 검색하기 
create index IDX_EMP01_ENAME
ON EMP01(ENAME);

select index_name, table_name, column_name
from USER_IND_COLUMNS
where table_name IN('ENP', 'EMP01');

select distinct empno, ename from emp01 where ename='aaaa';
--=> 인덱스 사용시: 빠른 검색 가능한 경우: 자료의 변화 적은 것 

--인덱스 지우기 
DROP Index IDX_EMP01_ENAME;

--iii)인덱스
--unique Index: 유일한 값을 가지는 컬럼에 대해서 설정
--non unique Index: 중복된 값을 같은 컬럼에 대해서 인덱스 설정(Default)
drop table dept01;
create table dept01
as
select * from dept where  1=0;

select * from dept01;

insert into dept01 values(10, '인사과', '서울');
insert into dept01 values(10, '인사과', '서울');
insert into dept01 values(10, '인사과', '서울');

--Unique Index
create unique index IDX_DEPT01_DEPNO
ON DEPT01(DEPTNO);

--Non-Unique Index 
create unique index IDX_DEPT01_Loc
ON DEPT01(LOC);

--결합 Index: 2개 이상의 컬럼으로 인덱스 구성 
create index IDX_DEPT01_Com
ON DEPT01(deptno, dname);

select index_name, table_name, column_name
from USER_IND_COLUMNS
where table_name IN('DEPT01');

--함수 기반 Index: 수식이나 함수를 적용해서 Index를 만드는 것 
create Index IDX_EMP01
ON EMP01(sal*12);

SET TIMING OFF

