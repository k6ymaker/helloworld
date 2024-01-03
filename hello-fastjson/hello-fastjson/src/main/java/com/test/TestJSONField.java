package com.test;

import com.alibaba.fastjson.JSON;
import com.test.entity.Teacher;

public class TestJSONField {
    public static void main(String[] args) {
        String jsonStr = "{\"t_name\":\"a\"}";
        Teacher teacher = JSON.parseObject(jsonStr, Teacher.class);
        System.out.println(teacher);
    }
}
