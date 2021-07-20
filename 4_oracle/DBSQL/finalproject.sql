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

commit;
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

update FP_Board set member_no = '2' where member_no = '5';

--글 작성 쿼리
insert into FP_Board values(
    FP_Board_seq.nextval,
    2,
    'bye',
    'bye',
    0,
    SYSDATE
);

commit;

--삭제 쿼리
delete from fp_board where board_no = 7;
--내용 수정 쿼리
update fp_board set board_title = '바꿘 내용~', board_content = '바뀐 내용~'
where board_no = 9;
--조회수 증가
update fp_board set board_readcount = board_readcount + 1
where board_no = 9;

--트랜잭션
select * from fp_board;

delete from FP_Board where board_no = 4;

commit;


----------------------------
--3.Hobby_Category Table 스키마
drop table FP_Hobby_Category;
create table FP_Hobby_Category(
    hobby_category_no NUMBER,
    hobby_category_name VARCHAR2(20)
);

drop sequence FP_Hobby_Category_seq;
create sequence FP_Hobby_Category_seq;

--test
insert into FP_Hobby_Category values(FP_Hobby_Category_seq.nextval, '야구');
insert into FP_Hobby_Category values(FP_Hobby_Category_seq.nextval, '축구');
insert into FP_Hobby_Category values(FP_Hobby_Category_seq.nextval, '농구');
insert into FP_Hobby_Category values(FP_Hobby_Category_seq.nextval, '당구');
insert into FP_Hobby_Category values(FP_Hobby_Category_seq.nextval, '족구');

commit;

select * from fp_hobby_category order by hobby_category_no ASC;

--4. Hobby able 스키마
drop table FP_Hobby;
create table FP_Hobby(
    hobby_no NUMBER,
    member_no NUMBER,
    hobby_category_no NUMBER
);

drop sequence FP_Hobby_seq;
create sequence FP_Hobby_seq;

--test
insert into FP_Hobby values(FP_Hobby_seq.nextval, 2, 3);

insert into FP_Hobby_Category values(FP_Hobby_Category_seq.nextval, '테니스');

commit;

select FP_Member_seq.nextval from Dual;

select * from FP_Hobby;
select * from FP_Member;
select * from FP_board;

delete from FP_Member where member_no = 2;
commit;
update FP_Member set member_no = 4 where member_no=1;
commit;

select * from FP_Board
where board_title like '%안녕%';

select '안녕' || '반갑' from FP_Board;

select * from FP_Board
where member_no = (select member_no from FP_Member where member_nick = '%한조%')
order by board_no DESC;

select * from FP_Board, FP_Member
where FP_Member.member_no = FP_Board.member_no
and FP_Member.member_nick like '%한조%';

-- ROWNUM 동작과정: 출력할때 번호를 증가시킴
--(페이지번호-1) * 페이지당 보여줄 개수+1 and (페이지번호 * 페이지당 보여줄 개수)
select * from(
    select t1.*, ROWNUM as rnum from(
        select * from FP_Board order by board_no desc
    ) t1
) t2
where t2.rnum >= (2-1)*10+1 and t2.rnum <= 2*10;

select count(*) from fp_board;

--5. FP_BoardImage table
DROP TABLE FP_BoardImage;
create table FP_BoardImage(
    image_no NUMBER,
    board_no NUMBER,
    image_url VARCHAR2(300),
    image_ori VARCHAR2(300)
);
drop sequence FP_BoardImage_seq;
create sequence FP_BoardImage_seq;

--test
insert into FP_BoardImage values(
    FP_BoardImage_seq.nextval,
    1,
    '2021/07/16/aaaaaa.jpg',
    'qqqq.jpg'
);

select * from FP_BoardImage
where board_no = 1
;

select * from FP_BoardImage
where board_no =1
order by image_no ASC
;

select FP_board_seq.nextval from Dual;

select * from FP_BoardImage;

--6. FP_Comment table
DROP TABLE FP_Comment;
create table FP_Comment(
    comment_no NUMBER,
    member_no NUMBER,
    board_no NUMBER,
    comment_content VARCHAR2(500),
    comment_writedate DATE
);
drop sequence FP_Comment_seq;
create sequence FP_Comment_seq;

select * from FP_Comment;

insert into FP_Comment values(
     FP_Comment_seq.nextval,
     1,
     580,
     'hihihi',
     SYSDATE
);
commit;

--7. FP_Recommend table
DROP TABLE FP_Recommend;
CREATE TABLE FP_Recommend(
    recommend_no NUMBER,
    board_no NUMBER,
    member_no NUMBER,
    recommend_date DATE
);

drop sequence FP_Recommend_seq;
create sequence FP_Recommend_seq;

select * from FP_Recommend;

insert into FP_Recommend values(
    FP_Recommend_seq.nextval,
    336,
    1,
    SYSDATE
);

commit;

--8. FP_MailAuth table
drop table FP_MailAuth;
create table FP_MailAuth(
    mailauth_no NUMBER,
    member_no NUMBER,
    mailauth_key VARCHAR2(100),
    mailauth_complete VARCHAR2(4),
    mailauth_date DATE
);

drop sequence FP_MailAuth_seq;
create sequence FP_MailAuth_seq;

commit;

--test
--회원 가입시
insert into FP_MailAuth values(
	FP_MailAuth_seq.nextval,
    3,
    'aweff-afwefwee-fweewfwefwf',
    'N',
    Null
);
--

update FP_MailAuth set mailauth_complete = 'Y', mailauth_date = SYSDATE
where mailauth_key = 'aweff-afwefwee-fweewfwefwf';

select  * from FP_Member, FP_MailAuth
where FP_mailauth.member_no = FP_Member.member_no
and FP_Member.member_id = 's001'
and FP_Member.member_pw = '1'
and FP_MailAuth.mailauth_complete = 'Y'
;
