package com.test.modle;

public class B extends A{
    String b;

    public B(){

    }

    public B(String a, String b) {
        super(a);
        this.b = b;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
