--DDL 정의 
--(0707) member Table 스키마 

drop table FP_Member;

create table FP_Member(
    member_no NUMBER,
    member_id VARCHAR2(20),
    member_pw VARCHAR2(160),
    member_nick VARCHAR2(20),
    member_gender VARCHAR2(4),
    member_birth DATE,
    member_phone VARCHAR2(20),
    member_email VARCHAR2(40),
    member_joindate DATE
);

drop sequence FP_Member_seq;
create sequence FP_Member_seq;

--test
select * from FP_Member;
--회원 가입 코드
insert into FP_Member values(
    FP_MEMBER_SEQ.nextval, 
    's007', 
    '1111', 
    '한조', 
    'M', 
    '90-11-11', 
    '010', 
    'ssss@sss.ss', 
    SYSDATE);
    
--로그인 쿼리
select * from FP_Member
where member_id = 's001'
and member_pw = '1111'
;
    