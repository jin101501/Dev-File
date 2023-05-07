package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmpService;
import com.example.demo.dto.student;

import java.util.List;

@RestController
public class HomeController {

  @Autowired
  EmpService service;

  @GetMapping("api/portal/selectEmpAll")
  public Object[] selectStudent() {
    List<student> testList = service.selectStudent();
    return testList.toArray();
  }

  @GetMapping("api/portal/selectStudent")
  public Object[] selectSpStudent(@RequestParam("name") String name) {
    List<student> testList = service.selectSpStudent(name);
    return testList.toArray();
  }
  // @GetMapping("api/portal/selectEmp")
  // public Object[] selectEmp(@RequestParam("name") String name) {
  // List<empVo> testList = service.selectEmp(name);
  // return testList.toArray();
  // }
}