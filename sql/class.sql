CREATE DATABASE IF NOT EXISTS COLLEGE;
-- DROP DATABASE IF EXISTS COMPANY;
USE COLLEGE; 
-- create table student(
-- id int primary key,
-- name varchar(50),
-- age int not null
-- );
-- insert into student Values(1,"satya",21);
-- insert into student Values(2,"sai",20);
-- insert into student Values(3,"kavya",19);
-- insert into student Values(4,"hasini",20);
-- insert into student Values(5,"shiva",21);
-- select * from student;
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
constraint check_age check(age>=18 and city = "Delhi"));
insert into city (id,city,age) values (1,"delhi",18),(2,"mumbai",19);