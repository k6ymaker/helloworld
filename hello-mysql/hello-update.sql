create database updatetest;

use updatetest;

create table person(
    id bigint(20) unsigned NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(20)
)


INSERT INTO person (name) values("xiaoming");
update person set name="xiaofang" where id = 1;