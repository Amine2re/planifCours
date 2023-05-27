package com.isms.planifCours.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessionCours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private int nbreHeure;
    @ManyToOne
    @JoinColumn(name = "cours_id")
    private Cours cours;
    @ManyToOne
    @JoinColumn(name = "salle_id")
    private Salle salle;
    @ManyToMany(mappedBy = "sessionsCours")
    private List<Etudiant> etudiants;
}
