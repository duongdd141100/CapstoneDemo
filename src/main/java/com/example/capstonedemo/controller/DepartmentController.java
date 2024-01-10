package com.example.capstonedemo.controller;

import com.example.capstonedemo.entity.Department;
import com.example.capstonedemo.entity.Employee;
import com.example.capstonedemo.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("")
    public ResponseEntity<List<Department>> findAll() {
        try {
            return ResponseEntity.ok(departmentService.findAll());
        } catch (Exception e) {
            log.error("Find all departments: " + e);
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Department> create(@RequestBody Department department) {
        try {
            return ResponseEntity.ok(departmentService.create(department));
        } catch (Exception e) {
            log.error("Create department: " + e);
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Department> update(@PathVariable Integer id, @RequestBody Department department) {
        try {
            return ResponseEntity.ok(departmentService.update(id, department));
        } catch (Exception e) {
            log.error("Update department: " + e);
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<Boolean> update(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(departmentService.delete(id));
        } catch (Exception e) {
            log.error("Update department: " + e);
            return ResponseEntity.badRequest().body(null);
        }
    }
}
