package com.isms.planifCours.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;


@Entity
@Data
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String numero;
    private int nombrePlaces;
    @OneToMany(mappedBy = "salle")
    private List<SessionCours> sessionsCours;

}
