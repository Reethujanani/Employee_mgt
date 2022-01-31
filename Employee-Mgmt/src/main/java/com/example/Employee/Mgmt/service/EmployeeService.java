package com.example.Employee.Mgmt.service;

import com.example.Employee.Mgmt.entity.Employee;
import com.example.Employee.Mgmt.repository.DepartmentRepository;
import com.example.Employee.Mgmt.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    static <AzureFileUploadServiceImpl> void setAzureFileUploadService(AzureFileUploadServiceImpl azureFileUploadService) {
    }

    static void setEmployeeRepository(EmployeeRepository employeeRepository) {
    }

    static void setDepartmentRepository(DepartmentRepository departmentRepository) {
    }

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployee(int id);

    void addEmployee(Employee employee);

    void updateEmployee(Employee e, int id);

    String deleteAllEmployees();

    String deleteEmployeeByID(int id);


    void deleteAll();

    void deleteById(int id);

    List<Employee> list(String first_name);
}
