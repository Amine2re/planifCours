package com.isms.planifCours.services.IService;

public interface IPlanification {

     void planifierClasse();
     void planifierCours();
     void planifierAnnee();
     void planifierSessionCours();
     void assignerCoursToEtudiant();
     void assignerCoursToProfesseur();
     void verifierDisponibiliteRessource();
     void verifierQuotaCours();

}
