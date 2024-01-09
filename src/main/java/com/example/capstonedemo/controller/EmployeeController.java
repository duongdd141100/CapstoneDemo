package com.example.capstonedemo.controller;

import com.example.capstonedemo.entity.Department;
import com.example.capstonedemo.entity.Employee;
import com.example.capstonedemo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        try {
            return ResponseEntity.ok(employeeService.create(employee));
        } catch (Exception e) {
            log.error("Create employee: " + e);
            return ResponseEntity.badRequest().body(null);
        }
    }
}
