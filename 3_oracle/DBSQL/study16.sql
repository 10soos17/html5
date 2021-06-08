-- Oracle: 대소문자 구분 x
-- 환경설정: utf-8
-- 글자크기: 

--테이블 삭제;
--Drop table goodsInfo;

--create table goodsinfo(
--code char(5) not null ,
--name varchar2(30) not null,
--price number(8,0) not null,
--maker varchar2(20) not null,
--PRIMARY KEY (code));

insert into goodsinfo values('10001','디지털1 TV', 350000, 'LG1');
insert into goodsinfo values('10002','디지털2 TV', 390000, 'LG2');
insert into goodsinfo values('10003','디지털3 TV', 150000, 'LG3');
insert into goodsinfo values('10004','디지털4 TV', 950000, 'LG4');
commit; --완전 저장, DML 조작어할때 사용(Insert, Update, Delete)
