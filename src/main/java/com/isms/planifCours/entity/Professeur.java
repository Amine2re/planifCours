package com.isms.planifCours.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
public class Professeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String specialite;
    private String grade;
    @ManyToMany(mappedBy = "professeurs")
    private List<Classe> classes;
    @ManyToMany(mappedBy = "professeurs")
    private List<Cours> cours;
}
