package com.example.demo.mapper;

import java.util.List;
import com.example.demo.dto.student;
import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;

@Mapper
public interface SampleMapper {
    List<student> selectStudent();

    // List<empVo> selectEmp(@Param("name") String name);
}