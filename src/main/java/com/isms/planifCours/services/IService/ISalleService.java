package com.isms.planifCours.services.IService;

import com.isms.planifCours.entity.Salle;

public interface ISalleService {

    void createSalle(Salle salle);
    void getSalleById(Long salleId);
    void addSalleToClasse(Long salleId, Long classeId);
}
