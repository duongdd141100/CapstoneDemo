package com.example.capstonedemo.controller;

import com.example.capstonedemo.entity.Department;
import com.example.capstonedemo.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/create")
    public ResponseEntity<Department> create(@RequestBody Department department) {
        try {
            return ResponseEntity.ok(departmentService.create(department));
        } catch (Exception e) {
            log.error("Create department: " + e);
            return ResponseEntity.badRequest().body(null);
        }
    }
}
