package com.example.demo.service;

import com.example.demo.mapper.SampleMapper;
import com.example.demo.dto.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpService {
    @Autowired
    SampleMapper sampleMapper;

    public List<student> selectStudent() {
        return sampleMapper.selectStudent();
    }

    public List<student> selectSpStudent(String name) {
        return sampleMapper.selectSpStudent(name);
    }

    // public List<empVo> selectEmp(String name) {
    // return sampleMapper.selectEmp(name);
    // }
}