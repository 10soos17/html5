--계정 만들기 pjt19/pjt19
Create User pjt19 IDENTIFIED BY pjt19;
Grant CONNECT, Resource to pjt19;
create table mms_member(
	id number constraint mms_id_seq primary key,
	name varchar2(12) unique not null,
	addr varchar2(50) not null,
    nation varchar2(12) not null,
	email varchar2(30) not null,
    age number
);

CREATE SEQUENCE id_seq 
increment by 1
start with 1;

insert into mms_member values(id_seq.nextval,'홍길동', '서울', '한국', 'a@a.com', 20);
commit;
