package com.codegym.service;

import com.codegym.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStaffService extends IService<Staff>{
    Page<Staff> getAll (Pageable pageable);
    Staff save(Staff staff);
    void delete(int id);
    Staff findById(int id);
    List<Staff> findByName(String name);
}
