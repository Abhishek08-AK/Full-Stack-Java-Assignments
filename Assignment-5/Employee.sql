use employeeinfo;
select * from comunication;
select * from contact;
select * from department;
select * from employee;
select * from payroll;
select * from registrations;
select * from Employee as e JOIN Contact as cn ON cn.e_id=e.id JOIN Comunication as cm ON cm.e_id=e.id JOIN Registrationtions as rg ON rg.e_id=e.id JOIN Department as dp ON dp.e_id=e.id JOIN Payroll as pr ON pr.e_id=e.id order by e.id ;



use productinfo;
create table proddetails(id int primary key auto_increment, name varchar(100), details varchar(150), variants varchar(100));
create table measureunits(id int primary key auto_increment,p_id int references  proddetails(id),piece varchar(10));
create table units(id int primary key auto_increment,p_id int references  proddetails(id), measure varchar(10), price varchar(100),perunit varchar(100));
create table allcost(id int primary key auto_increment,p_id int references proddetails(id), sum varchar(10));

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

insert into allcost values(null,1); 
insert into allcost values(null,2);
insert into allcost values(null,3);
insert into allcost values(null,4);

select * from proddetails;
select * from measureunits;
select * from units;
select * from allcost;

select * from proddetails as p JOIN measureunits as m ON m.p_id=p.id JOIN units as u ON u.p_id=p.id order by p.id ;
select p.id,p.name,p.details,p.variants,m.piece,u.measure,u.price,u.perunit,(u.price * m.piece) as TotalCost from proddetails as p JOIN measureunits as m ON m.p_id=p.id JOIN units as u ON u.p_id=p.id order by p.id ;
drop table allcost;
desc allcost;
