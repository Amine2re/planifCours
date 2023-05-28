package com.isms.planifCours.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "etudiant_id")
    private Etudiant etudiant;

    @ManyToOne
    @JoinColumn(name = "session_cours_id")
    private SessionCours sessionCours;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cours_id")
    private Cours cours;

    @Column(name = "justification")
    private String justification;


    public Absence(Etudiant etudiant, SessionCours sessionCours) {
        this.etudiant = etudiant;
        this.sessionCours = sessionCours;
    }

}
