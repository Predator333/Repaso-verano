select avg(alt) from circuits;
select country as pais, count(*) as num_circuitos from circuits group by country order by num_circuitos Desc;
SELECT name from circuits where country="France";
select name from circuits order by asc;
select location, country from circuits where alt>"500";
select circuitRef as ubicacion;
select name from circuits where country in ('Australia', 'Austria', 'Spain', 'Portugal', 'France', 'Netherland', 'United_Kingdom', 'Germany', 'Monaco', 'Hungary', 'Belgium', 'Italy');
select name from circuits where name like '%Grand%';
select country, count(*) as num_circuitos from circuits group by country;
select * from circuits where alt <(select avg(alt) from circuits);
select * from circuits where country in (select country from circuits group by country having count(country) > 3 );
select alt, lat from circuits where country in ('Japan');

select circuitRef from circuits where lat < "-25";
SELECT location, COUNT(*) AS circuits FROM circuits GROUP BY location ORDER BY circuits DESC;
select name, circuitRef from circuits where circuitRef= name;
select * from circuits where alt is not null;
select name from circuits where substring(name, 1,1) ='S';
select circuitRef as ubicacion;



select name from circuits where name like '%Circuit%';
select name from circuits where name like '%circuit%';
