--------system 계정--------------------------------------------------------------
--1. create account - javalink
Create User javalink IDENTIFIED BY javalink;
Grant CONNECT, Resource to javalink;

--------javalink 계정------------------------------------------------------------
--2. 계정 속성 만들기 - table 
create table member(
id varchar2(12),
password varchar2(12),
name varchar2(12),
age number,
addr varchar2(50),
email varchar2(30),
primary key(id)
)

--insert
insert into member values('aaa','aaa','홍길동', 22,'서울시','a@a.com남');
commit;
rollback;

select * from member;

