--Oracle: ����ڰ���=Database

--����� ���� ��Ȳ ����
select * from dba_users;

--���� Lock �����ϰ� ����ϱ�
alter user sh ACCOUNT UNLOCK;
alter user sh IDENTIFIED BY sh;

alter user PM ACCOUNT UNLOCK;
alter user PM IDENTIFIED BY PM;

--���� �����
Create User java IDENTIFIED BY java;
Grant CONNECT, Resource to java;

--create user madangDB identified by madangdb;
--Grant connect, resource to madangDB;

--계정 삭제
--Drop user java cascade;

