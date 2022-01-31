package com.example.Employee.Mgmt.repository;

import com.example.Employee.Mgmt.entity.Department;
import com.example.Employee.Mgmt.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
