package com.example.capstonedemo.controller;

import com.example.capstonedemo.entity.Employee;
import com.example.capstonedemo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    public ResponseEntity<List<Employee>> findAll() {
        try {
            return ResponseEntity.ok(employeeService.findAll());
        } catch (Exception e) {
            log.error("Find all employee: " + e);
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        try {
            return ResponseEntity.ok(employeeService.create(employee));
        } catch (Exception e) {
            log.error("Create employee: " + e);
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Employee> update(@PathVariable Integer id, @RequestBody Employee employee) {
        try {
            return ResponseEntity.ok(employeeService.update(id, employee));
        } catch (Exception e) {
            log.error("Update employee: " + e);
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<Boolean> update(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(employeeService.delete(id));
        } catch (Exception e) {
            log.error("Update employee: " + e);
            return ResponseEntity.badRequest().body(null);
        }
    }
}
