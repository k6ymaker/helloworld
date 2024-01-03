package com.test.source.struct.expr;


import java.util.ArrayList;

@MyAnnotation(value = "1",count = 10)
@SingleMemberAnnotation("1")
public class MyClass {
    String str;

    @Deprecated
    public void test(){
        int[] a = new int[]{1,2,3};
        int[] b = new int[2];
        System.out.println(a[1]);

        int i = 1;
        i = 2;
        i = 2 * 3 * 1 * 3123;

        boolean bool = true;
        bool = false;

        i = (int) 0.1;

        char c = 'c';

        MyClass.class.getName();

        if(c == 'c'){
            System.out.println(c);
        }

        System.out.println(1 == 2);


        MyClass myClass = new MyClass();
        System.out.println(myClass.str);

        System.out.println( "a" instanceof  String);

        int l = 2 > 1? 1: 2;
        System.out.println(l);

        Runnable runnable = ()-> System.out.println("1");

        System.out.println(123L);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.forEach(System.out::println);

        System.out.println(this != null);

        System.out.println(super.toString());

        System.out.println(i++);
    }
}
