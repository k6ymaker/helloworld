/* 建立数据库 */
CREATE DATABASE IF NOT EXISTS STUDENT_MANAGER;
USE STUDENT_MANAGER;

/***** 建立student表 *****/
CREATE TABLE IF NOT EXISTS STUDENT_TBL
(
    STUDENT_ID         int PRIMARY KEY AUTO_INCREMENT,
    STUDENT_NAME       VARCHAR(10) NOT NULL,
    STUDENT_SEX        VARCHAR(10),
    STUDENT_BIRTHDAY   VARCHAR(10),
    STUDENT_HOBBY      VARCHAR(10),
    CLASS_ID           int
);

/***** 建立teacher表 *****/
CREATE TABLE IF NOT EXISTS TEACHER_TBL
(
    TEACHER_ID int PRIMARY KEY AUTO_INCREMENT,
    TEACHER_NAME VARCHAR(10) NOT NULL,
    TEACHER_SEX VARCHAR(10),
    TEACHER_BIRTHDAY VARCHAR(10),
    WORK_DATE VARCHAR(10),
    PROFESSIONAL VARCHAR(10)
);


/***** 建立class表 *****/
CREATE TABLE IF NOT EXISTS CLASS_TBL
(
    CLASS_ID         int PRIMARY KEY AUTO_INCREMENT,
    CLASS_NAME       VARCHAR(10) NOT NULL,
    CLASS_YEAR       VARCHAR(10),
    TEACHER_ID        int
);

INSERT INTO TEACHER_TBL (TEACHER_NAME,
                         TEACHER_SEX,
                         TEACHER_BIRTHDAY,
                         WORK_DATE,
                         PROFESSIONAL)
VALUES ('wang',
        'man',
        '1996-04-11',
        '2019',
        'cs'
       );



INSERT INTO CLASS_TBL (CLASS_NAME,
                       CLASS_YEAR,
                       TEACHER_ID)
VALUES ('rocket',
        '1',
        1
       );

INSERT INTO STUDENT_TBL (
    STUDENT_NAME,
    STUDENT_SEX,
    STUDENT_BIRTHDAY,
    CLASS_ID
)

VALUES (
           'yujiang',
           'female',
           '2000',
           1
       );

INSERT INTO STUDENT_TBL (
    STUDENT_NAME,
    STUDENT_SEX,
    STUDENT_BIRTHDAY,
    CLASS_ID
)

VALUES (
           'zhang',
           'male',
           '2000',
           1
       );


USE STUDENT_MANAGER;

INSERT INTO STUDENT_TBL (
    STUDENT_NAME,
    STUDENT_SEX,
    STUDENT_BIRTHDAY,
    CLASS_ID
)

VALUES (
        'yuli',
        'female',
        '2001',
        1
    )