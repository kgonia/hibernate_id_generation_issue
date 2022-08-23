package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "employee", schema = "dbo")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeProjectId", nullable = false)
    private Integer id;
}
