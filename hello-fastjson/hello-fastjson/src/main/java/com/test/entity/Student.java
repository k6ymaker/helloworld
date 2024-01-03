package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Student {
    String name;
    School school;
}
