package com.isms.planifCours.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;
    private String filiere;
    private String niveau;

    @ManyToOne
    @JoinColumn(name = "annee_scolaire_id")
    private AnneeScolaire anneeScolaire;

    @OneToMany(mappedBy = "classe")
    private List<Etudiant> etudiants;

    @ManyToMany
    @JoinTable(
            name = "classe_professeur",
            joinColumns = @JoinColumn(name = "classe_id"),
            inverseJoinColumns = @JoinColumn(name = "professeur_id")
    )
    private List<Professeur> professeurs;

    public void addProfesseur(Professeur professeur) {
    }

    public void setSalle(Salle salle) {
    }
}
