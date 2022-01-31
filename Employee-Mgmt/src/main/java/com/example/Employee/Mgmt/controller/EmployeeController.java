package com.example.Employee.Mgmt.controller;

import com.example.Employee.Mgmt.entity.Employee;
import com.example.Employee.Mgmt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id){
        return employeeService.getEmployee(id);
    }


    @PostMapping("/employees")
    public void addEmployees(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }


    @PutMapping("/employees/{id}")
    public void updateEmployee(@RequestBody Employee e, @PathVariable int id){
        employeeService.updateEmployee(e, id);
    }


    @DeleteMapping("/employees")
    public void deleteAllEmployees(){
        employeeService.deleteAllEmployees();
    }

    // deleting employee by id
    @DeleteMapping("employees/{id}")
    public void deleteEmployeeByID(@RequestBody Employee e, @PathVariable int id){
        employeeService.deleteEmployeeByID(id);
    }

    @GetMapping("/search/{first_name}")
    public List<Employee> searchFirstName(@PathVariable String first_name)
    {
        return employeeService.list(first_name);
    }
}
