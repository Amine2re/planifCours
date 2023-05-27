package com.isms.planifCours.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Long id;
    private Long nom;
    private Long prenom;
    private String dateNaissance;
    private String tel;
    //private String niveauEtude;
    private List<Cours> cours;

}
