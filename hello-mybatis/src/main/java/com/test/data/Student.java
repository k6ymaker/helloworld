package com.test.data;

public class Student {
    int id;
    String name;
    Sex sex;
    String birthday;
    int classId;
    Hobby hobby;

    public Student(){
        this.hobby = new Hobby("");
    }

    public Student(String name, Sex sex, String birthday, int classId, Hobby hobby) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.classId = classId;
        this.hobby = hobby;
    }



    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", classId=" + classId +
                ", hobby=" + hobby +
                '}';
    }
}
