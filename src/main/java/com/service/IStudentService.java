package com.service;

import com.entity.Student;
import java.util.List;

public interface IStudentService {
    //     根据id查询学生
    Student queryStudentById(int id);
    //     添加学生
    void addStudent(Student student);
    //     查询全部学生
    List<Student> queryAllStudent();
}
