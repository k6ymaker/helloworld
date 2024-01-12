package com.test.config;


import com.test.HelloApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class PersonConfigTest {

    @Autowired
    private PersonConfig personConfig;

    @Test
    public void testToString(){
        System.out.println(personConfig.toString());
    }

}
