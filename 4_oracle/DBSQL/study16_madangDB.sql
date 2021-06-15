-- Oracle: ���냼臾몄옄 援щ텇 x
-- �솚寃쎌꽕�젙: utf-8
-- 湲��옄�겕湲�: 

<<<<<<< HEAD:3_oracle/DBSQL/study16.sql
--�뀒�씠釉� �궘�젣;
--Drop table goodsInfo;
=======
--계정 만들기 
create user madangDB identified by madangdb;
Grant connect, resource to madangDB;
>>>>>>> 49c01621b1576670982d3c8009de3b5ecc7fe7ff:4_oracle/DBSQL/study16_madangDB.sql

--테이블 삭제
Drop table goodsInfo;

<<<<<<< HEAD:3_oracle/DBSQL/study16.sql
insert into goodsinfo values('10001','�뵒吏��꽭1 TV', 350000, 'LG1');
insert into goodsinfo values('10002','�뵒吏��꽭2 TV', 390000, 'LG2');
insert into goodsinfo values('10003','�뵒吏��꽭3 TV', 150000, 'LG3');
insert into goodsinfo values('10004','�뵒吏��꽭4 TV', 950000, 'LG4');
commit; --�셿�쟾 ���옣, DML 議곗옉�뼱�븷�븣 �궗�슜(Insert, Update, Delete)

--2.sequence
--DB에서 연속적으로 증가하는 값을 표현: primary key
--MySQL: increment
-- memberid INT(6) primary key INCREMENT
-- Insert into aaa values(memberid, )
--Oracle: sequence
-- memberid Number(6) primary key
-- create sequence memberid_seq;
-- Insert into aaa values(memberid_seq.nextval

--sequence 생성: create sequence memberid_seq;
--sequence 삭제: drop sequence memberid_seq;
create sequence dept_deptno_seq;
select dept_deptno_seq.nextval from dual; --현재 시퀸스의 다음값을 반환
select dept_deptno_seq.currval from dual; --현재값 반환 

----<example>-----------------------
--drop table emp01;
create table emp01(
    empno number(4) primary key,
    ename varchar2(10),
    hiredate date  
);

create sequence emp_seq;

--empno는 sequence값을 사용해서 데이터 입력하기
insert into emp01 values(1, 'abcd',sysdate);
insert into emp01 values(emp_seq.nextval, 'abcd',sysdate);
insert into emp01 values(emp_seq.nextval, 'abcd',sysdate);

select * from emp01;

----<example>-----------------------
--10 인사과 서울
--20 경리과 서울
--30 총무과 대전
--40 기술팀 대전

create table dept_exam(
    deptno number(4) primary key,
    dname varchar2(16),
    loc  varchar2(15)
);
--drop sequence dept_exam_seq;
create sequence dept_exam_seq increment by 10 start with 0 minvalue 0;

insert into dept_exam values(dept_exam_seq.nextval, '인사과', '서울');
insert into dept_exam values(dept_exam_seq.nextval, '경리과', '서울');
insert into dept_exam values(dept_exam_seq.nextval, '총무과', '대전');
insert into dept_exam values(dept_exam_seq.nextval, '기술팀', '대전');

select * from dept_exam;

commit;

--3. Index
--SQL문의 처리 속도를 향상시키기 위해서 컬럼에 생성하는 객체
--Primary key, Unique와 같은 제약조건(Constraint: 명칭)을 자동인덱스 이름으로 사용한다.

select index_name, table_name, column_name from USER_IND_COLUMNS
where table_name IN ('EMP', 'DEPT');

commit;
drop table members;
create table members(
    id varchar2(20) primary key,
    password varchar2(20),
    name varchar2(16),
    age number(10),
    addr varchar2(20),
    email varchar2(16)
);
commit;
--SELECT name, ssn,
 --   decode(SUBSTR(gender, 8,1),1, '남자', 2,'여자', 3, '남자', 4,'여자')성별
  --  FROM members;



=======
--테이블 생성 
create table goodsinfo(
code char(5) not null ,
name varchar2(30) not null,
price number(8,0) not null,
maker varchar2(20) not null,
PRIMARY KEY (code));

--insert 
insert into goodsinfo values('10001','디지털1 TV', 350000, 'LG1');
insert into goodsinfo values('10002','디지털2 TV', 390000, 'LG2');
insert into goodsinfo values('10003','디지털3 TV', 150000, 'LG3');
insert into goodsinfo values('10004','디지털4 TV', 950000, 'LG4');
commit; --완전 저장, DML 조작어할때 사용(Insert, Update, Delete)
>>>>>>> 49c01621b1576670982d3c8009de3b5ecc7fe7ff:4_oracle/DBSQL/study16_madangDB.sql


