# https://www.cnblogs.com/muscleape/p/10064031.html
# json
CREATE  database json;

CREATE TABLE muscleape
(
    id       TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
    category JSON,
    tags     JSON,
    PRIMARY KEY (id)
);

DESC muscleape;

-- 直接插入字符串
INSERT INTO muscleape (category, tags) VALUES ('{"id": 1,"name": "muscleape"}','[1,2,3]');
-- 使用JSON函数
INSERT INTO muscleape (category, tags) VALUES (JSON_OBJECT("id",2,"name","muscleape_q"),JSON_ARRAY(1,3,5));


SELECT * FROM muscleape;

SELECT id,category->'$.id',category->'$.name',tags->'$[0]',tags->'$[2]' FROM muscleape;

SELECT id,category->'$.name',JSON_UNQUOTE(category->'$.name'),category->>'$.name',tags->'$[0]',tags->'$[2]' FROM muscleape;

SELECT * FROM muscleape WHERE category = CAST('{"id": 1,"name": "muscleape"}' AS JSON);


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

