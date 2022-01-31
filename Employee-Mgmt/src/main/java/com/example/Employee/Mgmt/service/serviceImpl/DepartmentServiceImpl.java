package com.example.Employee.Mgmt.service.serviceImpl;

import com.example.Employee.Mgmt.entity.Department;
import com.example.Employee.Mgmt.repository.DepartmentRepository;
import com.example.Employee.Mgmt.repository.EmployeeRepository;
import com.example.Employee.Mgmt.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

        @Autowired

        private DepartmentRepository departmentRepository;
    @Override
    public List<Department> getAllDepartments() {
      return departmentRepository.findAll();

    }

    @Override
    public Department getDepartment(int id) {
        Integer departmentId;
        Optional<Department> department = departmentRepository.findById(id);
        return department.get();
    }

    @Override
    public void addDepartment(Department department) {
    Department department1 = new Department();
    department1.setDepartmentId(department.getDepartmentId());
    department1.setDepartmentName(department.getDepartmentName());


    }

    @Override
    public void updateDepartment(Department d, int id) {
        Department department2 = new Department();
        department2.setDepartmentId(d.getDepartmentId());
        department2.setDepartmentName(d.getDepartmentName());

    }

    @Override
    public String deleteAllDepartment() {
        departmentRepository.deleteAll();
        return "deletedAll";
    }

    @Override
    public String deleteDepartmentByID(int id) {
        departmentRepository.deleteById(id);
        return "successfully deleted";
    }

    @Override
    public Optional<Department> findById() {
        return Optional.empty();
    }


}



