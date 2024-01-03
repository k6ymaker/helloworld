package com.test;

import com.alibaba.fastjson.JSON;
import com.test.entity.School;
import com.test.entity.Student;

public class Test {
    public static void main(String[] args) {
        School school = new School("ccnu");
        Student student = new Student("mike",school);
        String jsonStr = JSON.toJSONString(student);



        Student student1 = JSON.parseObject(jsonStr,Student.class);
        System.out.println(student1);
    }
}
