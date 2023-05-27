package com.isms.planifCours.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;

    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classe classe;

    @ManyToMany(mappedBy = "etudiants")
    private List<Cours> cours;
}