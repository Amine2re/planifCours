package com.isms.planifCours.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int nombreHeureGlobal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;

    @ManyToMany
    @JoinTable(
            name = "cours_module",
            joinColumns = @JoinColumn(name = "cours_id"),
            inverseJoinColumns = @JoinColumn(name = "module_id")
    )
    private List<Module> modules;
    @OneToMany(mappedBy = "cours")
    private List<SessionCours> sessionsCours;
    @ManyToMany(mappedBy = "cours")
    private List<Etudiant> etudiants = new ArrayList<>();

}
