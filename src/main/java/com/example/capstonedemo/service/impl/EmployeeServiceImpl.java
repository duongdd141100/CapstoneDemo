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
        return employeeRepo.findAll();
    }

    @Override
    public Employee create(Employee object) {
        return employeeRepo.save(object);
    }

    @Override
    public Employee update(Integer id, Employee object) {
        Employee employee = employeeRepo.findById(id).get();
        employee.setName(object.getName());
        employee.getDepartment().setId(object.getDepartment().getId());
        return employeeRepo.save(employee);
    }

    @Override
    public Boolean delete(Integer id) {
        employeeRepo.deleteById(id);
        return true;
    }
}
