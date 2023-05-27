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

    @Column(name = "justification")
    private String justification;

    // Constructeurs, getters et setters

    public Absence(Etudiant etudiant, SessionCours sessionCours) {
        this.etudiant = etudiant;
        this.sessionCours = sessionCours;
    }

}
