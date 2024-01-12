package com.test.mapper;

import com.test.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserXMLMapper userXMLMapper;

    @Test
    public void findAll(){
        List<User> users = userMapper.findAll();
        users.forEach(System.out::println);
    }

    @Test
    public void findAll1(){
        List<User> users = userXMLMapper.findAll();
        users.forEach(System.out::println);
    }
}
