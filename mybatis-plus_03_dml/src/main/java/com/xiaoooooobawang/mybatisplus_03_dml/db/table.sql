create database if not exists mybatisplus_db character set utf8;
use mybatisplus_db;
CREATE TABLE user (
                      id bigint(20) primary key auto_increment,
                      name varchar(32) not null,
                      password  varchar(32) not null,
                      age int(3) not null ,
                      tel varchar(32) not null
);
insert into user values(1,'Tom','tom',3,'18866668888');
insert into user values(2,'Jerry','jerry',4,'16688886666');
insert into user values(3,'Jock','123456',41,'18812345678');
insert into user values(4,'aaa','bbb',15,'1234567');