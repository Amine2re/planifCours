package com.isms.planifCours.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
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

    @ManyToMany
    @JoinTable(
            name = "etudiant_cours",
            joinColumns = @JoinColumn(name = "etudiant_id"),
            inverseJoinColumns = @JoinColumn(name = "cours_id")
    )
    private List<Cours> cours = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "session_cours_id")
    private SessionCours sessionCours;
}