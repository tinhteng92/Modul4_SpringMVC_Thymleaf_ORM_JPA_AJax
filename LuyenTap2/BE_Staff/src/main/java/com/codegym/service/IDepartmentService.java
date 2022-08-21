package com.codegym.service;

import com.codegym.model.Department;

import java.util.List;

public interface IDepartmentService extends IService<Department> {
    List<Department> getAll();
    Department save(Department department);

}
