package com.example2.demo_mvc_mybatis.controller;

import com.example2.demo_mvc_mybatis.pojo.Student;
import com.example2.demo_mvc_mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/selectStudentAll" ,method = RequestMethod.GET)
    public String selectStudentAll(){
        return studentService.selectAll().toString();
    }
    /**
     * 不在 mapper.xml 文件中写sql语句
     * */
    @RequestMapping(value = "/selectStudentAll2")
    public String selectStudentAll2(){
        return studentService.selectAll2().toString();
    }
    /**
     * 返回json格式
     * */
    @RequestMapping(value = "/selectStudentAll3")
    public Map<String,Object> selectStudentAll3(){
       List<Student> ls= studentService.selectAll2();
       Map<String,Object> map=new HashMap<>();
       map.put("resualt",ls);
       return map;
    }
}
