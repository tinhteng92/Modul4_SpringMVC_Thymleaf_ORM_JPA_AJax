package com.codegym.repository;

import com.codegym.model.Staff;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IStaffRepo extends PagingAndSortingRepository<Staff, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM MD4_staffManagement.Staff where name like concat('%',:name,'%');")
    List<Staff> findAllByNameContaining(String name);

}
