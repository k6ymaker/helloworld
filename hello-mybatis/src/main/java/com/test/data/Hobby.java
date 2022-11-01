package com.test.data;

public class Hobby {
    public String name;

    public Hobby(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                '}';
    }
}
