CREATE DATABASE IF NOT EXISTS college;
-- DROP DATABASE IF EXISTS COMPANY;
USE colleg; 
create table student(
id int primary key,
name varchar(50),
age int not null
);
insert into student Values(1,"satya",21);
insert into student Values(2,"sai",20);
insert into student Values(3,"kavya",19);
insert into student Values(4,"hasini",20);
insert into student Values(5,"shiva",21);
select * from student;
-- SHOW DATABASES;
 -- SHOW TABLES;
 DROP TABLE IF EXISTS STUDENT;
 CREATE TABLE  STUDENT(
 roll int primary key,
 name varchar(50) not null
 );
 insert into student (roll, name) values(101,"satya");
 insert into student (roll,name) values(102,"sai");
 insert into student (roll,name) values(103,"kavya");
 insert into student (roll,name) values(104,"hasini");
 select * from student;

-- second table......................................................................................
-- create database Satya_solutions;
use college;
create table Employee_info(
 id int primary key,
 name varchar(50),
 salary float not null
 );
 insert into Employee_info
 (id ,name,salary)
 values
 (1,"adam",25000.0),
(2,"bob",30000.0),
 (3,"casey",40000.0);
select * from employee_info;

CREATE TABLE CITY(
id int primary key,
city varchar(50) not null,
age int ,
constraint check_age check(age>=18 ));
insert into city (id,city,age) values (1,"Delhi",18);
insert into city (id,city,age) values (2,"Delhi",19);
insert into city (id,city,age) values (3,"mumbai",18);
insert into city (id,city,age) values (4,"Hyderabad",19);
insert into city (id,city,age) values (5,"Rajasthan",23);
insert into city (id,city,age) values (6,"kerala",22);
insert into city (id,city,age) values (7,"karnataka",19);

-- distinct keyword ...usgae
select DISTINCT city from city;
-- where caluse(conditional query)
select city ,age from city where age >=19;
select city ,age from city where age >18 AND city="Delhi";
select city age from city where age >=19 or city="Delhi";
select city from city where age between 19 and 22;
select age from city where city in ("Delhi","mumbai");
select age from city where city not in ("Delhi","mumbai");
-- limit cluase..(reyurn limited data from the databases..
select * from city limit 4;
--order by clause...
select city from city order by city DESC;
-- agregate functions
create table marks(
name varchar(50) primary key not null,
roll int not null,
subject varchar(50),
marks int not null);
INSERT into marks (name,roll,subject,marks) VALUES("Satya",1,"programming",97);
INSERT into marks (name,roll,subject,marks) VALUES("Sai",2,"programming",83);
INSERT into marks (name,roll,subject,marks) VALUES("Shiva",3,"social",87);
INSERT into marks (name,roll,subject,marks) VALUES("Sathwik",4,"maths",90);
INSERT into marks (name,roll,subject,marks) VALUES("Suresh",5,"physics",64);
INSERT into marks (name,roll,subject,marks) VALUES("Sujeeth",6,"biologu",73);
INSERT into marks (name,roll,subject,marks) VALUES("Sunil",7,"chemistry",68);
INSERT into marks (name,roll,subject,marks) VALUES("Sowmya",8,"social",64);
INSERT into marks (name,roll,subject,marks) VALUES("Sathwika",9,"maths",70);
INSERT into marks (name,roll,subject,marks) VALUES("Sunitha",10,"biologu",62);
INSERT into marks (name,roll,subject,marks) VALUES("Samantha",11,"chemistry",93);
Insert into marks(name,roll,marks) values("sravani",12,97);
-- Aggregate functions
select sum(marks) from marks;
select Avg(marks) from marks;
select min(marks) from marks;
select max(marks) from marks;
select count(roll) from marks;
select * from marks order by marks desc;
-- operators like function returns the values which are likely to start with'%character'
--AND
select * from marks where marks>70 and name like 'S%';
--or
select * from marks where marks>70 or name like 'S%';

-- group by clause
SELECT subject,avg (marks) from marks group by subject ;
--having clause
select sum(marks),name,subject from marks group by name,subject having max(marks)>80;
-- general order 
select name,roll,marks from marks where name like 'sa%'
group by name,roll,marks having max(marks)>80 order by roll;
-- updating rows data with a condition
--set SQL_SAFE_UPDATES=0;
update marks set subject = "programming",marks = 80 where name="Samantha";
--DELETE
delete from marks where marks < 70;
select * from marks where subject is null;
select * from marks where subject is not null;
update marks set subject="Dsa" where name  like 'sr%';
select * from marks;
-- limit,Fetch first n rows only..
select * from marks limit 5;
SELECT TOP 7 PERCENT * FROM marks;
select * from marks FETCH FIRST 3 ROWS ONLY;

-- foriegn keys
create table if not EXISTS dept(
id int primary key,
name varchar(50));
INSERT	INTO dept(id,name)
values(101,"cse"),
(102,"DS"),
(103,"CS");
UPDATE dept set id=104 where id=103;
create table teacher(
id int primary key,
name varchar(50),
dept_id int,
FOREIGN key(dept_id) REFERENCES dept(id)
on DELETE CASCADE
on UPDATE CASCADE
);
INSERT INTO teacher( id,name,dept_id)
VALUES(101,"SATYA",101),
(102,"SOWMYA",102),
(103,"SAI",101),
(104,"KAVYA",102),
(105,"MOHAN",103);
select * from teacher where id=105;


----- Alter commands...
--Add a column to the table...
ALTER  table dept
add COLUMN dept_head varchar(50);
UPDATE dept 
SET dept_head = CASE 
    WHEN id = 101 THEN 'ramarao'
    WHEN id = 102 THEN 'nagarjuna'
    WHEN id = 103 THEN 'chiranjeevi'
    -- Add more WHEN conditions for ids 103, 104, 105 as needed
    ELSE dept_head
END
WHERE id BETWEEN 100 AND 105;

-- similarily drop columns works wth alter keyword..
-- rename keyword
ALTER table dept rename to department;
-- change COLUMN name

ALTER TABLE department 
RENAME  head_of_the_dept TO dept_head ;

-- modify datatype
--alter table dept modify id int;

-- truncate table query(to delete tables data)

--@@Joins in sql:
-- inner join with department and student tables
alter table department rename id to dept_id;

-- inner join
select * from department as d INNER JOIN teacher
as t on d.dept_id = t.dept_id;

-- left JOIN
select * from department as d left JOIN teacher
as t on d.dept_id = t.dept_id;

-- right JOIN
select * from department as d right JOIN teacher
as t on d.dept_id = t.dept_id;

-- Full join(left join union right join)....
-- EXCLUSIVE left JOIN
select * from department as d left JOIN teacher
as t on d.dept_id = t.dept_id where d.dept_id is NULL;

--self join
select a.name as dept_name, b.name as teachers  from department as a
join teacher as b on a.dept_id=b.id;

--union:
select name from department
UNION
select name from teacher;

-- sql sub queries:
--ex-1
select name,marks from marks 
where marks>
(select avg(marks) from marks);

--ex-2
select name,marks from marks where roll in(select roll from marks where roll %2 =0); 

--ex-3
-- select max(marks) from (select name from students where city="delhi")as temp ;

---VIEW
create view sample as 
select name,roll,subject from marks;

select * from sample;








