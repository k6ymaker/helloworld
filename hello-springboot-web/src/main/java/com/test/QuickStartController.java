package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class QuickStartController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(@RequestParam String name){
        return "hello,"+name;
    }
}
