package com.test.source.struct.stmt;

import java.util.ArrayList;

public class MyClass extends SuperClass{
    class InnerClass {
        // 内部类定义
    }

    public MyClass(String f) {
        super(f);
    }

    {
        System.out.println("instance initializer ");
    }

    public void test() throws Exception{

        {
            System.out.println("method inner block");
        }

        for(int i=1;i<10;i++){
            System.out.println("for block");
            if(i==1){
                continue;
            }
            break;
        }

        double x = Math.abs(-123.23);
        assert x >= 0;
        System.out.println(x);

        try{

        }catch (Exception e){

        }

        int i1=1;
        do{
            i1++;
        }while (i1<10);

        ;
        ;
        Integer w = new Integer("1");

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer integer : list) {
            System.out.println(integer);
        }

        if(1==1){

        }

        outerLoop: for (int i = 0; i < 5; i++) {
            innerLoop: for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    break outerLoop; // 使用标签跳出外层循环
                }
                System.out.println(i + " - " + j);
            }
        }


        String xstr = "";
        switch (xstr){
            case "":
                System.out.println("");
                break;
            case "1":
                System.out.println("1");
                break;
            default:
                System.out.println("default");
        }

        synchronized(this.f){
            if(this.f == ""){
                throw new Exception();
            }
        }

        int i2=0;
        while(i2 < 10){
            i2+=1;
        }

        return;
    }
}
