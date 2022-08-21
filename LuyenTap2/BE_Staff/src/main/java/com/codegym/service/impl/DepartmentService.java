package com.codegym.service.impl;

import com.codegym.model.Department;
import com.codegym.repository.IDepartmentRepo;
import com.codegym.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentService implements IDepartmentService {
    @Autowired
    IDepartmentRepo iDepartmentRepo;


    @Override
    public List<Department> getAll() {
        return (List<Department>) iDepartmentRepo.findAll();
    }

    @Override
    public Department save(Department department) {
        return null;
    }


}
