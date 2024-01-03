package com.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.test.entity.School;
import com.test.entity.Student;

public class TestArray {
    public static void main(String[] args) {
        School school = new School("ccnu");
        Student student = new Student("mike",school);

        School school1 = new School("ccnu");
        Student student1 = new Student("mike",school);

        Student[] students = new Student[]{student,student1};

        String studentsStr = JSON.toJSONString(students, SerializerFeature.DisableCircularReferenceDetect);

        System.out.println(studentsStr);
    }
}
