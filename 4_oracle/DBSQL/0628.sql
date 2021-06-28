--================0628
--https://blog.naver.com/s001lechttps://blog.naver.com/s001lec

drop table Matchresult;

CREATE TABLE Matchresult(
    ranking NUMBER(4),
    horse_number NUMBER(4),
    horse_name VARCHAR2(40),
    horse_origin VARCHAR2(10),
    horse_sex VARCHAR2(10),
    horse_age NUMBER(4),
    jockey_weight NUMBER(8),
    rating VARCHAR2(10), --??
    jockey_name VARCHAR2(20),
    assistant_name VARCHAR2(20),
    owner_name VARCHAR2(20),
    arrival_difference VARCHAR2(20),
    horse_weight NUMBER(8),
    dan_win NUMBER(20),
    yun_win NUMBER(20),
    equipment VARCHAR2(200),
    running_date DATE,
    race_number NUMBER(4)
);

select count(*) from  Matchresult;

select * from  Matchresult where race_number between 0 and 10;

--생산지 종류 확인 
select distinct horse_origin from Matchresult;

select horse_origin, count(*) from Matchresult
group by horse_origin;

--출생지별 1위 카운트
select horse_origin from Matchresult
where ranking = 1
group by horse_origin
order by count(*) desc;
--출생지별 승률
select 
round((win.cnt/total.cnt)*100) as percentage, total.horse_origin 
from (
select count(*) cnt, horse_origin from Matchresult
group by horse_origin) total
,
(select count(*) cnt, horse_origin from Matchresult
where ranking in (1)
group by horse_origin) win 

where total.horse_origin = win.horse_origin
order by percentage desc;


--가장 많이 우승한 말 (1,2등)
select horse_name, count(*) from Matchresult 
where ranking in (1,2)
group by horse_name
order by count(*) asc;

--가장 많이 출전할 말
select horse_name, count(*) from Matchresult
group by horse_name
order by count(*) desc;

--가장 많이 출전한 선수(자키)
select jockey_name,count(*) from Matchresult
group by jockey_name
order by count(*) desc;

--박태종의 년도별 출전 횟수
select count(TO_CHAR(running_date, 'YYYY')) from Matchresult
where jockey_name = '박태종'
group by TO_CHAR(running_date, 'YYYY') 
order by TO_CHAR(running_date, 'YYYY') asc;

--박태종의 년도별 출전 횟수, 승률 
select t1.cnt, (
    select count(*) from Matchresult
    where jockey_name like '박태종'
    and ranking in(1,2)
)/t1.cnt * 100 from(
    select count(*) as cnt from matchresult
    where jockey_name like '박태종'
)t1;


--출전 순서는 경기 결과에 영향을 주는가?

--박태종 선수의 년도별 체중 변화
select jockey_weight, TO_CHAR(running_date, 'YYYY') from Matchresult
where jockey_name = '박태종'
order by TO_CHAR(running_date, 'YYYY') asc;
    
--박태종 선수의 년도별 승률(계속 유지되고 있나??)

select round(win.cnt/total.cnt * 100) percentage, win.dt from
(select count(*) cnt, TO_CHAR(running_date, 'YYYY') dt from Matchresult
where jockey_name like '박태종'
and ranking in (1) 
group by TO_CHAR(running_date, 'YYYY')) win
,
(select count(*) cnt, TO_CHAR(running_date, 'YYYY') dt from Matchresult
where jockey_name like '박태종'
group by TO_CHAR(running_date, 'YYYY'))total

where win.dt = total.dt
order by win.dt asc;

--가장 승률이 좋은 말의 나이는?

--승리를 가장 많이 한 말..

--말 출생지 별 승률..

--말의 무게별 승률 (가장 무게가 적합한 말은 무엇인가?)

--말을 가장 많이 가지고 있는 오너

--오너 별 승률

--평균 단승 배당률

--가장 높은 단승 배당

--가장 높은 단승 배당을 이뤄낸 말과 그 말의 평균 승률

--배당과 승률의 상관관계

--가장 높은 승률의 말과 평균 배당(음...)

--출전 회수가 100회 이상인 선수들에 한해서 평균 배당...

--승리 기수의 평균 무게

--가장 나이가 많은 말

--출전 순서는 경기 결과에 영향을 주는가?

--박태종 선수의 년도별 체중 변화

--박태종 선수의 년도별 승률(계속 유지되고 있나??)

--가장 승률이 좋은 말의 나이는?

--승리를 가장 많이 한 말..

--말 출생지 별 승률..

--말의 무게별 승률 (가장 무게가 적합한 말은 무엇인가?)

--말을 가장 많이 가지고 있는 오너

--오너 별 승률

--평균 단승 배당률

--가장 높은 단승 배당

--가장 높은 단승 배당을 이뤄낸 말과 그 말의 평균 승률

--배당과 승률의 상관관계

--가장 높은 승률의 말과 평균 배당(음...)

--출전 회수가 100회 이상인 선수들에 한해서 평균 배당...

--승리 기수의 평균 무게

--가장 나이가 많은 말
