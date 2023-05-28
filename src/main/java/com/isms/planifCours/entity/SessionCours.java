package com.isms.planifCours.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
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
    @OneToMany(mappedBy = "sessionCours")
    private List<Etudiant> etudiants = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;
}
