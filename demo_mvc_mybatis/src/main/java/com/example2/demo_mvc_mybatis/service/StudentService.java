package com.example2.demo_mvc_mybatis.service;

import com.example2.demo_mvc_mybatis.pojo.Student;

import java.util.List;

public interface StudentService {

    List<Student> selectAll();

    List<Student> selectAll2();
}

