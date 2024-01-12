package com.test.controller;

import com.test.config.PersonConfig;
import com.test.test.CreateTableDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Value("${name}")
//    private String name;
//
//    @Value("${person.name}")
//    private String name1;
//
//    @Value("${person.age}")
//    private String age1;
//
//    @Value("${address[0]}")
//    private String address1;
//
//    @Value("${msg1}")
//    private String msg1;
//
//    @Value("${msg2}")
//    private String msg2;
//
//    @Autowired
//    private Environment env;
//
//    @Autowired
//    private PersonConfig personConfig;
//
//    @RequestMapping("/hello")
//    public String hello(){
//        return "hello springboot !";
//    }
//
//    @RequestMapping("/hello1")
//    public String hello1(){
//        return "Hello "+name+ "!";
//    }
//
//    @RequestMapping("/hello2")
//    public String hello2(){
//        System.out.println(address1);
//        System.out.println(name1);
//        System.out.println(age1);
//        System.out.println(msg1);
//        System.out.println(msg2);
//
//        System.out.println(env.getProperty("address[0]"));
//
//        System.out.println(personConfig.getName());
//        System.out.println(personConfig.getAge());
//
//        String[] address = personConfig.getAddress();
//        for (String s : address) {
//            System.out.println(s);
//        }
//
//        return "name:" + name1 + " age:"+age1;
//    }

    @PostMapping("createTable")
    public String test1(@RequestBody CreateTableDto dto){
        System.out.println(dto.getBusinessFlag());
        return "1";
    }
}
