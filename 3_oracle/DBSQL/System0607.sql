--Oracle: 사용자계정=Database

--사용자 계정 상황 보기
select * from dba_users;

--계정 Lock 해제하고 사용하기
alter user sh ACCOUNT UNLOCK;
alter user sh IDENTIFIED BY sh;

alter user PM ACCOUNT UNLOCK;
alter user PM IDENTIFIED BY PM;

--계정 만들기
--Create User java IDENTIFIED BY java;
--Grant CONNECT, Resource to java;

create user madangDB identified by madangdb;
Grant connect, resource to madangDB;


