package com.isms.planifCours.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Data
public class Cours {

    private Long id;
    private String Libelle;
    private String dateCreation;
    private String dateExpiration;
    public List<Etudiant> etudiants;
    public List<Professeur> professeurs;

}
