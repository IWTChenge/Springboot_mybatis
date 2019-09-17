package com.example2.demo_mvc_mybatis.service.impl;

import com.example2.demo_mvc_mybatis.dao.StudentDao;
import com.example2.demo_mvc_mybatis.pojo.Student;
import com.example2.demo_mvc_mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }

    @Override
    public List<Student> selectAll2() {
        return studentDao.selectAll2();
    }
}
