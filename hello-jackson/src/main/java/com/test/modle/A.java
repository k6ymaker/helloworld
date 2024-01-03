package com.test.modle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = A.class, name = "A"),
        @JsonSubTypes.Type(value = B.class, name = "B")
})
public class A {
    String a;

    public A(String a) {
        this.a = a;
    }

    public A() {
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
