package com.codegym.repository;

import com.codegym.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface IDepartmentRepo extends CrudRepository<Department, Integer> {
}
