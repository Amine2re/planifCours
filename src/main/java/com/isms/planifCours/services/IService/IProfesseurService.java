package com.isms.planifCours.services.IService;

import com.isms.planifCours.entity.Professeur;

public interface IProfesseurService {

    void ajouterProfesseur(Professeur professeur);
    void getProfesseurById(Long professeurId);
    void getAllProfesseurs();
}
