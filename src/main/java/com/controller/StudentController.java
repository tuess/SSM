package com.controller;

import com.entity.Student;
import com.service.IStudentService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Component("studentController")
@Controller
@RequestMapping("controller")
public class StudentController {
//    控制器依赖于service
    private IStudentService studentService;

    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("queryStudentById/{id}")
    public String queryStudentById(@PathVariable("id") Integer id, Map<String,Object> map){
        Student student = studentService.queryStudentById(id);
        System.out.println(student);
        map.put("student",student);
        return "queryStudentById";
    }

    @RequestMapping("queryAllStudent")
    public String queryAllStudent(Map<String,Object> map){
        List<Student> students = studentService.queryAllStudent();
        System.out.println(students);
        map.put("students",students);
        return "queryAllStudent";
    }
}
