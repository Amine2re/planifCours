package com.isms.planifCours.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.List;


@Entity
@Data
public class Professeur {

    private Long id;
    private Long nom;
    private Long prenom;
    private String dateNaissance;
    private String tel;
    private List<Cours> cours;

}
