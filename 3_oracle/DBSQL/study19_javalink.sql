--create user
Create User javalink IDENTIFIED BY javalink;
Grant CONNECT, Resource to javalink;

--table 
create table member(
id varchar2(15),
password varchar2(10),
name varchar2(10),
age number,
gender varchar2(5),
email varchar2(30),
primary key(id)
)

--insert
insert into member values('aaa','aaa','홍길동', 22,'서울시','a@a.com');
commit;

