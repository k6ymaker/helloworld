package com.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Teacher {

    @Getter
    @Setter
    String name;
    String id;
}
