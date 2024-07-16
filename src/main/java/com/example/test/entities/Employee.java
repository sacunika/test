package com.example.test.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Entity
@Table(name = "employee")
@AllArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idEmployee")
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_post")
//    @JsonBackReference
    @JsonIgnoreProperties("employees")
    private Post post;
}
