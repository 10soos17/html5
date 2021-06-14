--계정 만들기 pjt19/pjt19
Create User pjt19 IDENTIFIED BY pjt19;
Grant CONNECT, Resource to pjt19;

CREATE TABLE mms_member(
	id NUMBER PRIMARY KEY,
	name VARCHAR2(12) UNIQUE NOT NULL,
	addr VARCHAR2(50) NOT NULL,
	nation VARCHAR2(12) NOT NULL,
	email VARCHAR2(30) NOT NULL,
	age NUMBER NULL
    );
    
CREATE SEQUENCE id_seq 
--increment by 1
--start with 1;

insert into mms_member values(id_seq.nextval,'홍길동', '서울', '한국', 'a@a.com', 20);
commit;
