--Oracle: 사용자계정=Database
--만든 계정: java, javalink, madangDB(madangdb), pjt19

-- 사용자 계정 상황 보기
select * from dba_users;

-- 계정 Lock 해제하고 사용하기
alter user sh ACCOUNT UNLOCK;
alter user sh IDENTIFIED BY sh;

alter user pm ACCOUNT UNLOCK;
alter user pm IDENTIFIED BY pm;

--계정 만들기
Create User java IDENTIFIED BY java;
Grant CONNECT,Resource to java;

--계정삭제
Drop user java cascade;

Grant CONNECT,Resource to madangDB;
grant create session to madangDB;
grant create view, create procedure, create sequence to madangDB;

commit;