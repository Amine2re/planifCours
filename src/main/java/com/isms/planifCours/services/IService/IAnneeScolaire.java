package com.isms.planifCours.services.IService;

import com.isms.planifCours.entity.AnneeScolaire;

public interface IAnneeScolaire {
    void creerAnneeScolaire(AnneeScolaire anneeScolaire);
    void getAnneeScolaireById(Long anneeScolaireId);
    void getAllAnneesScolaires();
}
