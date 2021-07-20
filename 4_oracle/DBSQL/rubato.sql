--DDL 정의 
--(0720 ~ ) 

--1.RBT_Member Table 스키마 

drop table RBT_Member;

create table RBT_Member(
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

drop sequence RBT_Member_seq;
create sequence RBT_Member_seq;

commit;
--test

select * from RBT_Member;

--회원 가입 쿼리
insert into RBT_Member values(
    RBT_MEMBER_SEQ.nextval, 
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
select * from RBT_Member
where member_id = 's001'
and member_pw = '1111'
;

commit;

--------------------------
--2. RBT_Board Table 스키마

drop table RBT_Board;
create table RBT_Board(
    board_no NUMBER,
    member_no NUMBER,
    board_title VARCHAR2(400),
    board_content VARCHAR2(4000),
    board_readcount NUMBER,
    board_writedate DATE
);

drop sequence RBT_Board_seq;
create sequence RBT_Board_seq;

--test

select * from RBT_Board order by board_no DESC;
select * from RBT_Member where member_no=2;

select * from RBT_Board, RBT_Member
where RBT_Board.member_no = RBT_Member.member_no
order by board_no desc;

update RBT_Board set member_no = '2' where member_no = '5';

--글 작성 쿼리 
insert into RBT_Board values(
    RBT_Board_seq.nextval,
    2,
    'bye',
    'bye',
    0,
    SYSDATE
);

commit;

--삭제 쿼리
delete from RBT_board where board_no = 7;
--내용 수정 쿼리
update RBT_board set board_title = '바꿘 내용~', board_content = '바뀐 내용~'
where board_no = 9;
--조회수 증가
update RBT_board set board_readcount = board_readcount + 1
where board_no = 9;

--트랜잭션
select * from RBT_board;

delete from RBT_Board where board_no = 4;

commit;


----------------------------
--3.Hobby_Category Table 스키마 
drop table RBT_Hobby_Category;
create table RBT_Hobby_Category(
    hobby_category_no NUMBER,
    hobby_category_name VARCHAR2(20)
);

drop sequence RBT_Hobby_Category_seq;
create sequence RBT_Hobby_Category_seq;

--test
insert into RBT_Hobby_Category values(RBT_Hobby_Category_seq.nextval, '야구');
insert into RBT_Hobby_Category values(RBT_Hobby_Category_seq.nextval, '축구');
insert into RBT_Hobby_Category values(RBT_Hobby_Category_seq.nextval, '농구');
insert into RBT_Hobby_Category values(RBT_Hobby_Category_seq.nextval, '당구');
insert into RBT_Hobby_Category values(RBT_Hobby_Category_seq.nextval, '족구');

commit;

select * from RBT_hobby_category order by hobby_category_no ASC;

--4. Hobby able 스키마 
drop table RBT_Hobby;
create table RBT_Hobby(
    hobby_no NUMBER,
    member_no NUMBER,
    hobby_category_no NUMBER
);

drop sequence RBT_Hobby_seq;
create sequence RBT_Hobby_seq;

--test
insert into RBT_Hobby values(RBT_Hobby_seq.nextval, 2, 3);

insert into RBT_Hobby_Category values(RBT_Hobby_Category_seq.nextval, '테니스');

commit;

select RBT_Member_seq.nextval from Dual;

select * from RBT_Hobby;
select * from RBT_Member;
select * from RBT_board;

delete from RBT_Member where member_no = 2;
commit;
update RBT_Member set member_no = 4 where member_no=1;
commit;

select * from RBT_Board
where board_title like '%안녕%';

select '안녕' || '반갑' from RBT_Board;

select * from RBT_Board
where member_no = (select member_no from RBT_Member where member_nick = '%한조%')
order by board_no DESC;

select * from RBT_Board, RBT_Member
where RBT_Member.member_no = RBT_Board.member_no
and RBT_Member.member_nick like '%한조%';

-- ROWNUM 동작과정: 출력할때 번호를 증가시킴
--(페이지번호-1) * 페이지당 보여줄 개수+1 and (페이지번호 * 페이지당 보여줄 개수)
select * from(
    select t1.*, ROWNUM as rnum from(
        select * from RBT_Board order by board_no desc
    ) t1
) t2 
where t2.rnum >= (2-1)*10+1 and t2.rnum <= 2*10; 

select count(*) from RBT_board;

--5. RBT_BoardImage table
DROP TABLE RBT_BoardImage;
create table RBT_BoardImage(
    image_no NUMBER,
    board_no NUMBER,
    image_url VARCHAR2(300),
    image_ori VARCHAR2(300)
);
drop sequence RBT_BoardImage_seq;
create sequence RBT_BoardImage_seq;

--test
insert into RBT_BoardImage values(
    RBT_BoardImage_seq.nextval,
    1,
    '2021/07/16/aaaaaa.jpg',
    'qqqq.jpg'
);

select * from RBT_BoardImage
where board_no = 1
;

select * from RBT_BoardImage
where board_no =1
order by image_no ASC
;

select RBT_board_seq.nextval from Dual;

select * from RBT_BoardImage;

--6. RBT_Comment table
DROP TABLE RBT_Comment;
create table RBT_Comment(
    comment_no NUMBER,
    member_no NUMBER,
    board_no NUMBER,
    comment_content VARCHAR2(500),
    comment_writedate DATE
);
drop sequence RBT_Comment_seq;
create sequence RBT_Comment_seq;

select * from RBT_Comment;

insert into RBT_Comment values(
     RBT_Comment_seq.nextval,
     1,
     580,
     'hihihi',
     SYSDATE
);
commit;

--7. RBT_Recommend table
DROP TABLE RBT_Recommend;
CREATE TABLE RBT_Recommend(
    recommend_no NUMBER,
    board_no NUMBER,
    member_no NUMBER,
    recommend_date DATE
);

drop sequence RBT_Recommend_seq;
create sequence RBT_Recommend_seq;

select * from RBT_Recommend;

insert into RBT_Recommend values(
    RBT_Recommend_seq.nextval,
    336,
    1,
    SYSDATE
);

commit;

--8. RBT_MailAuth table
drop table RBT_MailAuth;
create table RBT_MailAuth(
    mailauth_no NUMBER,
    member_no NUMBER,
    mailauth_key VARCHAR2(100),
    mailauth_complete VARCHAR2(4),
    mailauth_date DATE
);

drop sequence RBT_MailAuth_seq;
create sequence RBT_MailAuth_seq;

commit;

--test
--회원 가입시
insert into RBT_MailAuth values(
	RBT_MailAuth_seq.nextval,
    3,
    'aweff-afwefwee-fweewfwefwf',
    'N',
    Null
);
--

update RBT_MailAuth set mailauth_complete = 'Y', mailauth_date = SYSDATE
where mailauth_key = 'aweff-afwefwee-fweewfwefwf';

select  * from RBT_Member, RBT_MailAuth
where RBT_mailauth.member_no = RBT_Member.member_no
and RBT_Member.member_id = 's001'
and RBT_Member.member_pw = '1'
and RBT_MailAuth.mailauth_complete = 'Y'
;
