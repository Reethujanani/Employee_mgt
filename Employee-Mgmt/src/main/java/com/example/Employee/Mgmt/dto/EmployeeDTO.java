package com.example.Employee.Mgmt.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

    private int employeeId;
    private String firstName;
    private String lastName;
    private int mobileNo;
    private String city;
    private int isActive;
    private int isDeleted;
}
