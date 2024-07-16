package com.example.test.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "employee")
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Long idEmployee;
    @Column(name = "FIO")
    private String FIO;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "education")
    private String education;
    @Column(name = "experience")
    private int experience;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_post")
    private Post post;
}
