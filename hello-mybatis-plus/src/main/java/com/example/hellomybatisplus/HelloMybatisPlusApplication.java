package com.example.hellomybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.hellomybatisplus.mapper")
@SpringBootApplication
public class HelloMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloMybatisPlusApplication.class, args);
    }

}
