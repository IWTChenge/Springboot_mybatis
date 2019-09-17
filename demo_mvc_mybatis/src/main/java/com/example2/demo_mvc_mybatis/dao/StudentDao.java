package com.example2.demo_mvc_mybatis.dao;

import com.example2.demo_mvc_mybatis.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentDao {
    List<Student> selectAll();

    @ResultType(value = com.example2.demo_mvc_mybatis.pojo.Student.class)
    @Select("select * from student")
    List<Student> selectAll2();
}
