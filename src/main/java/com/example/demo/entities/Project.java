package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "project", schema = "dbo")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

}