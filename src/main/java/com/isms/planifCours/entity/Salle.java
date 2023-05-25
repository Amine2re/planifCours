package com.isms.planifCours.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.List;


@Entity
@Data
public class Salle {

    private Long id;
    private String numSalle;
    private boolean isDisponible;
    private List<Cours> cours;

}
