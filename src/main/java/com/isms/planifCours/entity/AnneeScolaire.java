package com.isms.planifCours.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class AnneeScolaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String annee;
    @OneToMany(mappedBy = "anneeScolaire")
    private List<Classe> classes;

}
