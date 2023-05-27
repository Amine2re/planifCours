package com.isms.planifCours.services.IService;

import com.isms.planifCours.entity.AnneeScolaire;
import com.isms.planifCours.entity.Classe;
import com.isms.planifCours.entity.Etudiant;

import java.util.List;

public interface IClasseService {
    void createClasse(Classe classe);
    void getClasseById(Long classeId);
    void planifierClasses(AnneeScolaire anneeScolaire, List<Classe> classes);
}
