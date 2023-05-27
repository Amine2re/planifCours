package com.isms.planifCours.domain.services.IService;

import com.isms.planifCours.entity.*;

import java.util.Optional;

public interface IAdmin {
     void inscrireEtudiant(Etudiant etudiant);
     void creerEtudiant(Etudiant etudiant);
     void creerProfesseur(Professeur professeur);
     void creerSemestre(AnneeScolaire anneeScolaire);
     void ajouterNouveauProfesseur();
    void creerSalle(Salle salle);
    void creerAnneeScolaire(AnneeScolaire anneeScolaire);
    void assignerCoursToEtudiant(Long idCours,Etudiant etudiant);
    void planifierSession(Cours cours, Session idSession);
    void annulerSession(Long idSession);
    void filtrerSession(String type,Long idSession);
    void filtrerCours(String type,Long idSession);
    void listerCours(String type,Long idSession);
    void listerEtudiant(String type,Long idSession);
    void demandeAnnulationCours(Cours cours,Professeur professeur);
    void validerSessionCours(Professeur professeur,Long idCours);
    Cours findCoursById(Long idCours);
    Etudiant findEtudiantyId(Long idEtudiant);
    //void validerSessionCours(Professeur professeur,Long idCours);

}
