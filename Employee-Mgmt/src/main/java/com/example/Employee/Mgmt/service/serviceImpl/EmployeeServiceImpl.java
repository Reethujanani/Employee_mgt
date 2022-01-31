package com.example.Employee.Mgmt.service.serviceImpl;

import com.example.Employee.Mgmt.entity.Employee;
import com.example.Employee.Mgmt.repository.EmployeeRepository;
import com.example.Employee.Mgmt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired

    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployee(int id) {
        return employeeRepository.findById(id);

    }

    @Override
    public void addEmployee(Employee employee) {
        Employee employee1 = new Employee();
        employee1.setEmployeeId(employee.getEmployeeId());
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        employee1.setMobileNo(employee.getMobileNo());
        employee1.setCity(employee.getCity());
        employee1.setIsActive(employee.getIsActive());
        employee1.setIsDeleted(employee.getIsDeleted());

    }


    public void updateEmployee(Employee e, int id) {
        Employee emp = new Employee();
        emp.setEmployeeId(e.getEmployeeId());
        emp.setFirstName(e.getFirstName());
        emp.setLastName(e.getLastName());
        emp.setMobileNo(e.getMobileNo());
        emp.setCity(e.getCity());
        emp.setIsActive(e.getIsActive());
        emp.setIsDeleted(e.getIsDeleted());



    }

    @Override
    public String deleteAllEmployees() {
        employeeRepository.deleteAll();
        return "deleted All";
    }

    @Override
    public String deleteEmployeeByID(int id) {
        employeeRepository.deleteById(id);
        return "successfully deleted";

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<Employee> list(String Search)
    {
        return employeeRepository.findByFirstNameLikeOrLastNameLikeOrCityLike("%"+Search+"%","%"+Search+"%","%"+Search+"%");

    }

}
