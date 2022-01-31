package com.example.Employee.Mgmt.service;

import com.example.Employee.Mgmt.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    List<Department> getAllDepartments();

    Department getDepartment(int id);

    void addDepartment(Department department);

    void updateDepartment(Department d, int id);

    String deleteAllDepartment();

    String deleteDepartmentByID(int id);

    Optional<Department> findById();
}
