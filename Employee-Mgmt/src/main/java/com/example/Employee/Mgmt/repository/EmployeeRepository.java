package com.example.Employee.Mgmt.repository;

import com.example.Employee.Mgmt.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    @Query(value = "select r from Employee r where r.firstName LIKE %:searchtext% or r.lastName LIKE %:searchtext% or r.city LIKE %:searchtext%")
    List<Employee> findByAllColumns(@Param("searchtext") String searchtext);


    List<Employee> findByFirstNameLikeOrLastNameLikeOrCityLike(String s, String s1, String s2);
}


