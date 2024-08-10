create database productinfo;

use productinfo;


create table proddetails(id int primary key auto_increment, name varchar(100), details varchar(150), variants varchar(100));
create table measureunits(id int primary key auto_increment,p_id int references  proddetails(id),piece varchar(10));
create table units(id int primary key auto_increment,p_id int references  proddetails(id), measure varchar(10), price varchar(100),perunit varchar(100));

insert into proddetails values(null,"Parle-G","It is so tasty","Parlie-Gold");
insert into proddetails values(null,"Happy-Happy","It is black Chocolate","Happy-Gold");
insert into proddetails values(null,"Realme","realme12 g54","realme 512gb");
insert into proddetails values(null,"Milk"," it is halthy","Butter");

insert into measureunits values(null,2,"16");
insert into measureunits values(null,4,"5");
insert into measureunits values(null,3,"1");
insert into measureunits values(null,1,"8");

insert into units values(null,3,"piece","12000","piece");
insert into units values(null,1,"dozen","10","dozen");
insert into units values(null,4,"liter","25","500ml");
insert into units values(null,2,"dozen","5","dozen");

select * from proddetails;
select * from measureunits;
select * from units;

Select count(name) from proddetails;
Select sum(price) from units;
Select avg(price) from units;
Select max(price) from units;
Select min(price) from units;
select * from proddetails group by variants;


-- SELECT variants FROM proddetails LEFT JOIN measureunits ON proddetails.variants = measureunits.piece;
-- SELECT measure FROM units RIGHT JOIN measureunits ON units.measure = measureunits.piece;

SELECT column_name(s)
FROM table1
RIGHT JOIN table2
ON table1.column_name = table2.column_name;

select * from proddetails as p JOIN measureunits as m ON m.p_id=p.id JOIN units as u ON u.p_id=p.id order by p.id ;
select p.id,p.name,p.details,p.variants,m.piece,u.measure,u.price,u.perunit,(u.price * m.piece) as TotalCost from proddetails as p JOIN measureunits as m ON m.p_id=p.id JOIN units as u ON u.p_id=p.id order by p.id ;




