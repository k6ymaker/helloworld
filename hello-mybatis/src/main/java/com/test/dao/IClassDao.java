package com.test.dao;

import com.test.data.Class;

public interface IClassDao {
    public Class getClassById(int id);

    public Class getClassAndTeacher(int id);
}
