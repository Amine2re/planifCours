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
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Long id;
    private String nom;
    private String numSalle;
    private boolean isDisponible;
    private List<Cours> cours;

}
