package com.isms.planifCours.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
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

    @ManyToMany
    @JoinTable(
            name = "professeur_cours",
            joinColumns = @JoinColumn(name = "professeur_id"),
            inverseJoinColumns = @JoinColumn(name = "cours_id")
    )
    private List<Cours> cours = new ArrayList<>();;
}
