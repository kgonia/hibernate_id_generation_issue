package com.example.demo.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "client", schema = "dbo")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany
    @JoinTable(name = "client_appointment", schema = "dbo",
            joinColumns = @JoinColumn(name = "client_ID"),
            inverseJoinColumns = @JoinColumn(name = "appointment_ID"))
    private Set<Appointment> appointments;
}