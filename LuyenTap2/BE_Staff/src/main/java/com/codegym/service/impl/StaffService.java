package com.codegym.service.impl;

import com.codegym.model.Staff;
import com.codegym.repository.IStaffRepo;
import com.codegym.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService implements IStaffService{
    @Autowired
    IStaffRepo iStaffRepo;

    @Override
    public List<Staff> getAll() {
        return null;
    }

    @Override
    public Page<Staff> getAll(Pageable pageable) {
        return iStaffRepo.findAll(pageable);
    }

    @Override
    public Staff save(Staff staff) {
        Staff staff1=iStaffRepo.save(staff);
        return staff1 ;
    }

    @Override
    public void delete(int id) {
        iStaffRepo.deleteById(id);
    }

    @Override
    public Staff findById(int id) {
        return iStaffRepo.findById(id).get();
    }

    @Override
    public List<Staff> findByName(String name) {
        return iStaffRepo.findAllByNameContaining(name);
    }
}