package com.isms.planifCours.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.isms.planifCours.enums.typeSession;

@Entity
@Data
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Long id;
    private String date;
    private String heureDebut;
    private String heureFin;
    private String nbrHeure;
    private typeSession typeSession;

}
