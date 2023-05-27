package com.isms.planifCours.entity;

import lombok.Data;
import lombok.NonNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class AnneeScolaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private String id;
    private String duree;
    private String debutAnnee;
    private String finAnnee;

}
