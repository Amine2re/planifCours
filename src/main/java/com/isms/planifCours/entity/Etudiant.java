package com.isms.planifCours.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class    Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Long id;
    private Long nom;
    private Long prenom;
    private String dateNaissance;
    private String tel;
    //private String niveauEtude;

    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private List<Cours> cours;

}
