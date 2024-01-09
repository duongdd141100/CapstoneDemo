package com.example.capstonedemo.service.impl;

import com.example.capstonedemo.entity.Employee;
import com.example.capstonedemo.repository.EmployeeRepository;
import com.example.capstonedemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee create(Employee object) {
        return employeeRepo.save(object);
    }

    @Override
    public Employee update(Employee object) {
        return null;
    }

    @Override
    public Boolean delete(Employee object) {
        return null;
    }
}
