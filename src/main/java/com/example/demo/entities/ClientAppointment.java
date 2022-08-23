package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "client_appointment", schema = "dbo")
public class ClientAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_ID", nullable = false)
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "appointment_ID", nullable = false)
    private Appointment appointment;

}
