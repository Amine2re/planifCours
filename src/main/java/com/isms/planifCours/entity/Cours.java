package com.isms.planifCours.entity;

import com.isms.planifCours.enums.Session;
import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Data
public class Cours {

    private Long id;
    private String Libelle;
    private String duree;
    private String dateCreation;
    private String dateExpiration;
    private Session sessionType;
    public List<Etudiant> etudiants;
    public List<Salle> salles;
    public Professeur professeur;

}
