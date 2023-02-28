#时间相关
create database timetest;

create table person_data(
    name        varchar(20);
    create_time  datetime;
);

insert into person_data (
    name,       
    create_time
) values(
    'xiyangyang',
    '2013-01-11 11:11:11'
)


select * 
from person_data 
where create_time < DATE_FORMAT('2013-01-11 11:11:10','%Y-%m-%d %H:%i:%S');

