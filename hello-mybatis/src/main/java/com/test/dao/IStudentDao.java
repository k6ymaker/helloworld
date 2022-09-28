package com.test.dao;

import com.test.data.Student;

import java.util.List;

public interface IStudentDao {
    public Student getStudentById(int id);

    public List<Student> getStudentByClassId(int id);
}
