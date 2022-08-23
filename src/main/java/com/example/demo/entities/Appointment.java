package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment", schema = "dbo")
public class Appointment {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}