package com.isms.planifCours.services.IService;

import com.isms.planifCours.entity.Classe;
import com.isms.planifCours.entity.Cours;
import com.isms.planifCours.entity.Professeur;

import java.util.List;

public interface ICoursService {

    void createCours(Cours cours);
    void getCoursById(Long coursId);
    void planifierCours(Module module, Professeur professeur, List<Classe> classes);
}
