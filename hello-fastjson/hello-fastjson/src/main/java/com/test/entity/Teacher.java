package com.test.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Teacher {

    @JSONField(name="t_name")
    String name;
}
