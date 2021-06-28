DROP table orders;
DROP table book;
DROP table customer;


CREATE TABLE Book (
  bookid      NUMBER(2) PRIMARY KEY,
  bookname    VARCHAR2(40),
  publisher   VARCHAR2(40),
  price       NUMBER(8) 
);

CREATE TABLE  Customer (
  custid      NUMBER(2) PRIMARY KEY,  
  name        VARCHAR2(40),
  address     VARCHAR2(50),
  phone       VARCHAR2(20)
);


CREATE TABLE Orders (
  orderid NUMBER(2) PRIMARY KEY,
  custid  NUMBER(2) REFERENCES Customer(custid),
  bookid  NUMBER(2) REFERENCES Book(bookid),
  saleprice NUMBER(8) ,
  orderdate DATE
);


-- Book, Customer, Orders 데이터 생성
INSERT INTO Book VALUES(1, '축구의 역사', '굿스포츠', 7000);
INSERT INTO Book VALUES(2, '축구아는 여자', '나무수', 13000);
INSERT INTO Book VALUES(3, '축구의 이해', '대한미디어', 22000);
INSERT INTO Book VALUES(4, '골프 바이블', '대한미디어', 35000);
INSERT INTO Book VALUES(5, '피겨 교본', '굿스포츠', 8000);
INSERT INTO Book VALUES(6, '역도 단계별기술', '굿스포츠', 6000);
INSERT INTO Book VALUES(7, '야구의 추억', '이상미디어', 20000);
INSERT INTO Book VALUES(8, '야구를 부탁해', '이상미디어', 13000);
INSERT INTO Book VALUES(9, '올림픽 이야기', '삼성당', 7500);
INSERT INTO Book VALUES(10, 'Olympic Champions', 'Pearson', 13000);

INSERT INTO Customer VALUES (1, '박지성', '영국 맨체스타', '000-5000-0001');
INSERT INTO Customer VALUES (2, '김연아', '대한민국 서울', '000-6000-0001');  
INSERT INTO Customer VALUES (3, '장미란', '대한민국 강원도', '000-7000-0001');
INSERT INTO Customer VALUES (4, '추신수', '미국 클리블랜드', '000-8000-0001');
INSERT INTO Customer VALUES (5, '박세리', '대한민국 대전',  NULL);

INSERT INTO Orders VALUES (1, 1, 1, 6000, TO_DATE('2014-07-01','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (2, 1, 3, 21000, TO_DATE('2014-07-03','yyyy-mm-dd'));
INSERT INTO Orders VALUES (3, 2, 5, 8000, TO_DATE('2014-07-03','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (4, 3, 6, 6000, TO_DATE('2014-07-04','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (5, 4, 7, 20000, TO_DATE('2014-07-05','yyyy-mm-dd'));
INSERT INTO Orders VALUES (6, 1, 2, 12000, TO_DATE('2014-07-07','yyyy-mm-dd'));
INSERT INTO Orders VALUES (7, 4, 8, 13000, TO_DATE( '2014-07-07','yyyy-mm-dd'));
INSERT INTO Orders VALUES (8, 3, 10, 12000, TO_DATE('2014-07-08','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (9, 2, 10, 7000, TO_DATE('2014-07-09','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (10, 3, 8, 13000, TO_DATE('2014-07-10','yyyy-mm-dd'));

select * from book;
select * from Customer;
select * from Orders;


--=======https://blog.naver.com/s001lechttps://blog.naver.com/s001lec=========
--1
select bookname from Book where bookid = 1;

select bookname from Book where price >= 20000;

select sum(saleprice) from Orders where custid = (select custid from Customer where name = '박지성');

select count(*) as cnt from Orders where custid = (select custid from Customer where name = '박지성');

--2
select count(*) as title from Book;

select count(DISTINCT publisher) from Book;

select custid, address from Customer;

select orderid from Orders where orderdate BETWEEN '20140704' AND '20140707';
/* = select orderid from Orders where orderdate >= TO_DATE('14-07-04','YY-MM-DD') AND orderdate <= TO_DATE('14-07-07','YY-MM-DD'); (더 추천하는 방식)*/

select orderid from Orders where orderdate < TO_DATE('14-07-04','YY-MM-DD') OR orderdate > TO_DATE('14-07-07','YY-MM-DD');
/* = select orderid from Orders where orderdate NOT BETWEEN '20140704' AND '20140707'; */

select name from Customer where substr(name,0,1) = '김';
/* 
select name from Customer where name like '김%';
select name from Customer where name like '%김%';
select name from Customer where name like '김_';
*/

select name, address from Customer where substr(name,1,1) = '김' and substr(name, 3,1) = '아';
/*
select name from Customer where name like '김_아';
select name from Customer where name like '김%아';
*/

--심화
--1
--박지성이 구매한 도서의 출판사 수
select count(DISTINCT publisher) from Book 
where bookid in(select bookid from Orders 
where custid = (select custid from Customer where name = '박지성')); --in 대신 =any 가능 

/*select count(DISTINCT b.publisher) from Orders o, Customer c, Book b
where o.custid = c.custid
AND o.bookid = b.bookid
AND c.name LIKE '박지성';
*/

--박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이
select bookname, price, price-Orders.saleprice from Book
inner join Orders on Book.bookid = Orders.bookid 
where custid = (select custid from Customer where name = '박지성');
/*
select Book.bookname, Book.price, Book.price - Orders.saleprice from Orders, Customer, Book
where Orders.custid = Customer.custid
and Orders.bookid = Book.bookid
and Customer.name like '박지성';
*/

--박지성이 구매하지 않은 도서의 이름 
---> !=사용하면 안됨 
---> 박지성이 구매한 도서를 먼저 구한 후 전체 도서에서 제외시키는 방법으로 할 것 : not in / minus
select bookname from Book
where bookname NOT IN(
    select b.bookname from Orders o, Book b, Customer c 
    where o.custid = c.custid and o.bookid = b.bookid
    and c.name = '박지성'
);
/*
select bookname from Book
minus
select b.bookname from Orders o, Book b, Customer c 
where o.custid = c.custid and o.bookid = b.bookid
and c.name = '박지성';
*/

--2
--조인 : 내부 조인(98%), 외부 조인(1.5%)
--서브 쿼리 
--select (___) from (____) where (____) = (____)
--group by - 통계 ... 집계 ... ~별 ...

/*select t1.* from(
select 
    orders.orderid as a,
    book.bookname as b, 
    book.price - orders.saleprice as c
from orders, book
where orders.bookid = book.bookid
) t1
where t1.c = 1000
;
*/

--상관 부속질의의 이해(다중 for문) 
select (
    select cs.name from customer cs 
    where cs.custid = od.custid --내부 for문 
) from orders od; --바깥 for문 


-- 주문하지 않은 고객의 이름 : not in
select name from Customer
where custid not in (select custid from Orders);
/*select name from Customer
where name not in('박지성', '추신수');
*/

--주문 금액의 총액과 주문의 평균 금액
select sum(saleprice), avg(saleprice) from Orders;

--고객의 이름과 고객별 구매액
select Customer.name, sum(saleprice) from Orders
inner join Customer on Customer.custid = Orders.custid
group by Customer.name;
/*
select custid, sum(saleprice), count(*), avg(saleprice) from Orders
group by custid
having custid >=1--group by 후에 having
;

select custid, sum(saleprice), count(*), avg(saleprice) from Orders--group by 전에 where
where custid >=1
group by custid
;

select cs.name, t1.sss from(
    select custid , sum(saleprice) as sss from orders
    group by custid
)t1, customer cs
where t1.custid = cs.custid;

--상관 부속질의로 해결하는 법
select (
    select cc.name from customer cc where cc.custid = od.custid
) as nm , sum(saleprice) as sss from orders od
group by custid;
*/



--고객의 이름과 고객이 구매한 도서 목록
select Customer.name, Book.bookname from Orders
inner join Customer on Customer.custid = Orders.custid
inner join Book on Book.bookid = Orders.bookid;
/*
select c.name, b.bookname from customer c, book b, orders o
where o.custid = c.custid and o.bookid = b.bookid;
*/


--도서의 가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은 주문
select b.* from book b, orders o
where b.bookid = o.bookid
and b.price - o.saleprice = (
    select max(book.price - orders.saleprice) from Book
    inner join Orders on Book.bookid = Orders.bookid);

/*
select b1.* from orders o1, book b1
where o1.bookid = b1.bookid
and b1.price - o1.saleprice = (
    select max(bb.price - oo.saleprice) from orders oo, book bb
    where oo.bookid = bb.bookid
);
*/

--도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름
select Customer.name from Orders
inner join Customer on Orders.custid=Customer.custid
group by Customer.name 
having avg(Orders.saleprice) > (select avg(Orders.saleprice) from Orders);

/*
select o1.custid, avg(o1.saleprice) from orders o1
group by o1.custid
having avg(o1.saleprice) > (select avg(saleprice) from orders);
*/

--3

--박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select DISTINCT Customer.name from Book
inner join Orders on Book.bookid = Orders.bookid
inner join Customer on Customer.custid = Orders.custid
where Book.publisher 
in
(select Book.publisher from Book
inner join Orders on Book.bookid = Orders.bookid
inner join Customer on Customer.custid = Orders.custid
where Customer.name = '박지성');
/*
select distinct c1.name from orders o1, book b1, customer c1
where o1.custid = c1.custid and o1.bookid = b1.bookid
and b1.publisher in (
    select b.publisher from orders o, book b, customer c
    where o.custid = c.custid and o.bookid = b.bookid
    and c.name LIKE '박지성'
);
*/

--두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select Customer.name from Book
inner join Orders on Book.bookid = Orders.bookid
inner join Customer on Customer.custid = Orders.custid
group by Customer.name
having count(DISTINCT Book.publisher) > 1;

/*
select * from(
    select o.custid from orders o, book b
    where o.bookid = b.bookid
    group by o.custid
    having count(distinct b.publisher) >= 2
)t1, customer cs
where t1.custid = cs.custid;
*/

-- 전체 고객의 30% 이상이 구매한 도서
select b1.bookname from(
    select o1.bookid, count(*) as cnt from orders o1
    group by o1.bookid
)t1, book b1
where t1.bookid = b1.bookid 
and t1.cnt > (
    select count(*) * 0.3 as ccc from customer
);



--기본문제
select bookname, price from Book;

select bookid, bookname, publisher, price from Book;

select publisher from Book;

select bookname from Book where price < 20000;

select bookname from Book where 20000 >= price and price <= 10000;

select bookname from Book where publisher = '굿스포츠' or publisher = '대한미디어';

select bookname from Book where publisher != '굿스포츠' and publisher != '대한미디어';

select publisher from Book where bookname = '축구의 역사';

select publisher from Book where bookname like '%축구%';

select bookname from Book where substr(bookname, 2, 1) = '구';

select bookname from Book where price >= 20000;

select bookname from Book order by bookname;

select bookname from Book order by price, bookname;

select sum(saleprice) from Orders;

select sum(saleprice) from Orders where custid = (select custid from Customer where name = '김연아');

select sum(saleprice), avg(saleprice), min(saleprice), max(saleprice) from Orders;

select count(saleprice) from Orders;

select count(Orders.saleprice), Customer.name from Orders 
inner join Customer on Orders.custid = Customer.custid
where Orders.saleprice > 8000
group by name
having count(Orders.saleprice) > 1;
