package com.isms.planifCours.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;

    @ManyToMany(mappedBy = "modules")
    private List<Cours> cours;

    @OneToMany(mappedBy = "module")
    private List<SessionCours> sessionsCours = new ArrayList<>();

}
