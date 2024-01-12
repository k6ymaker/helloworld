create database hello_springboot;

use hello_springboot;

create table user(
     id int primary key auto_increment,
     username varchar(30),
     password varchar(30)
);

insert into user(username,password) value('zhangsan','zhangsan123');
insert into user(username,password) value('lisi','lisi123');
