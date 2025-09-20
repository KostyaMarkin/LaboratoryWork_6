package com.MarkinKonstantin.LaboratoryWork_6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EDUCATIONAL_DESCIPLINES")
public class EducationalDesciplines {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "yearofstudy")
    private int yearOfStudy;
}
