package com.example.Employee.Mgmt.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "department")

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "department_name")
    private int departmentName;


}
