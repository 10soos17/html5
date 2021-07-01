create sequence Book_seq;
select Book_seq.nextval FROM dual;
commit;

select * from Book;