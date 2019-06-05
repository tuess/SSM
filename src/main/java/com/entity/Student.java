package com.entity;

public class Student {
    private int id;
    private String name;
    private String sex;
    private int classid;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public Student(int id, String name, String sex, int classid) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.classid = classid;
    }
}
