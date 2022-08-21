package com.codegym.controller;

import com.codegym.model.Staff;

import com.codegym.service.IDepartmentService;
import com.codegym.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/staff")
public class StaffAPI {
    @Autowired
    IStaffService staffService;

    @Autowired
    IDepartmentService departmentService;

    @GetMapping
    public Page<Staff> getAll(@RequestParam(defaultValue = "0") int page) {
        return staffService.getAll(PageRequest.of(page, 2));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Staff> findById(@PathVariable int id) {
        return new ResponseEntity<Staff>(staffService.findById(id), HttpStatus.OK) ;
    }

    @GetMapping("/search")
    public List<Staff> findByName(@RequestParam(defaultValue = "") String name) {
        return staffService.findByName(name);

    }

    @PostMapping
    public Staff create(@RequestBody Staff staff){
        return staffService.save(staff);
    }

    @PutMapping
    public ResponseEntity<Staff> edit(@RequestBody Staff staff) {
        return new ResponseEntity<Staff>(staffService.save(staff), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Staff> delete(@PathVariable int id){
        staffService.delete(id);
        return  new ResponseEntity(HttpStatus.OK);
    }
}

