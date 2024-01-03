package com.test.source.struct.body;

public class MyClass {

    // 静态初始化器
    static {
        // 静态初始化器的代码
    }

    // 实例初始化器
    {
        // 实例初始化器的代码
    }

    public String name;

    public MyClass() {
        System.out.println(1);
    }

    public void test(String hh){
        String a = "";
        System.out.println("test");
    }
}
