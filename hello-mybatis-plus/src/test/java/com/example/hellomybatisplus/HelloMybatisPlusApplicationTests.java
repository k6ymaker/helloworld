package com.example.hellomybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.hellomybatisplus.entity.User;
import com.example.hellomybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.management.Query;
import java.util.List;
import java.util.Map;

@SpringBootTest
class HelloMybatisPlusApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        for(User user:userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testQueryWrapper(){
        QueryWrapper<User> query = new QueryWrapper<>();

        query.select("name,count(id)"); //id,(select 1) as a,count(*)
        query.groupBy("name");

        List<Map<String, Object>> maps = userMapper.selectMaps(query);
        System.out.println(maps);
    }
}
