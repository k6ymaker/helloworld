package com.test.dao;

import com.test.data.Student;

import java.util.List;

public interface IStudentDao {
    public Student getStudentById(int id);

    public List<Student> getStudentByClassId(int id);

    public void insert(Student student);

    public List<Student> getAll();

    public void deleteById(int id);

    public void updateBirthday(Student student);

    //public List<Student> getStudentCreateBefore();
}
