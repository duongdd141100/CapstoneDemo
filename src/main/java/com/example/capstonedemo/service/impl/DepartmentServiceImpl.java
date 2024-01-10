package com.example.capstonedemo.service.impl;

import com.example.capstonedemo.entity.Department;
import com.example.capstonedemo.repository.DepartmentRepository;
import com.example.capstonedemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepo;

    @Override
    public List<Department> findAll() {
        return departmentRepo.findAll();
    }

    @Override
    public Department create(Department object) {
        return departmentRepo.save(object);
    }

    @Override
    public Department update(Integer id, Department object) {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        return null;
    }
}
