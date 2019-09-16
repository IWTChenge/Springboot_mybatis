package com.example2.demo_mvc_mybatis.controller;

import com.example2.demo_mvc_mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/selectStudentAll" ,method = RequestMethod.GET)
    public String selectStudentAll(){
        return studentService.selectAll().toString();
    }
}
