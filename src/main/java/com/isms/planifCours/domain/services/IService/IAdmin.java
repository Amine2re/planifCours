package com.isms.planifCours.domain.services.IService;

import com.isms.planifCours.entity.AnneeScolaire;
import com.isms.planifCours.entity.Etudiant;
import com.isms.planifCours.entity.Professeur;
import com.isms.planifCours.entity.Salle;

public interface IAdmin {
    public void inscrireEtudiant();
    public void creerEtudiant(Etudiant etudiant);
    public void creerProfesseur(Professeur professeur);
    public void creerSemestre(AnneeScolaire anneeScolaire);
    public void ajouterNouveauProfesseur();
    public void creerSalle(Salle salle);
    public void creerAnneeScolaire(AnneeScolaire anneeScolaire);

}
