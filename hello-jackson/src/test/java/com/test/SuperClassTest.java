package com.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.modle.A;
import com.test.modle.B;
import org.junit.Test;

public class SuperClassTest {
    @Test
    public void test1() throws Exception{
        A a = new B("a", "b");

        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(a);

        System.out.println(json);

        A deserializedA = objectMapper.readValue(json, A.class);
        System.out.println(deserializedA);
    }
}
