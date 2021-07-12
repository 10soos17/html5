--DDL 정의 
--(0707 ~ ) 

--1.FP_Member Table 스키마 

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

--회원 가입 쿼리
insert into FP_Member values(
    FP_MEMBER_SEQ.nextval, 
    's001', 
    '1111', 
    '한조', 
    'M', 
    '90-11-11', 
    '010', 
    'ssss@sss.ss', 
    SYSDATE
);

commit;

--로그인 쿼리
select * from FP_Member
where member_id = 's001'
and member_pw = '1111'
;

commit;

--------------------------
--2. FP_Board Table 스키마

drop table FP_Board;
create table FP_Board(
    board_no NUMBER,
    member_no NUMBER,
    board_title VARCHAR2(400),
    board_content VARCHAR2(4000),
    board_readcount NUMBER,
    board_writedate DATE
);

drop sequence FP_Board_seq;
create sequence FP_Board_seq;

--test

select * from FP_Board order by board_no DESC;
select * from FP_Member where member_no=2;

select * from FP_Board, FP_Member
where FP_Board.member_no = FP_Member.member_no
order by board_no desc;


--글 작성 쿼리 
insert into FP_Board values(
    FP_Board_seq.nextval,
    1,
    '테스트 제목입니다.',
    '테스트 내용입니다.',
    0,
    SYSDATE
);

commit;

--삭제 쿼리
delete from fp_board where board_no = 9;
--내용 수정 쿼리
update fp_board set board_title = '바꿘 내용~', board_conten = '바뀐 내용~'
where board_no = 9;
--조회수 증가
update fp_board set board_readcount = board_readcount + 1
where board_no = 9;

--트랜잭션
select * from fp_board;







