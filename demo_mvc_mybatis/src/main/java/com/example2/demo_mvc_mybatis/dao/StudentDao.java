package com.example2.demo_mvc_mybatis.dao;

import com.example2.demo_mvc_mybatis.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface StudentDao {
    List<Student> selectAll();
}
