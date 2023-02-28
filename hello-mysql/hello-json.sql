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