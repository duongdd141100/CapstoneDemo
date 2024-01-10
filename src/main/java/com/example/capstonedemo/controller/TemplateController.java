package com.example.capstonedemo.controller;

import com.example.capstonedemo.service.DepartmentService;
import com.example.capstonedemo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class TemplateController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping(value = {"", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/department/create")
    public String createDepartment() {
        return "create_department";
    }

    @GetMapping("/employee/create")
    public String createEmployee(Model model) {
        model.addAttribute("depts", departmentService.findAll());
        return "create_employee";
    }

    @GetMapping("/header")
    public String header() {
        return "header";
    }
}
