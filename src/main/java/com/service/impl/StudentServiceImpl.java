package com.service.impl;

import com.entity.Student;
import com.mapper.StudentMapper;
import com.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentService")
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public Student queryStudentById(int id) {
//        调用dao层
        Student student = studentMapper.queryStudentById(id);
        return student;
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

    @Override
    public List<Student> queryAllStudent() {
        List<Student> students = studentMapper.queryAllStudent();
        System.out.println(students);
        return students;
    }
}
