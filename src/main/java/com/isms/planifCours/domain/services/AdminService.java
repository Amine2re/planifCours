package com.isms.planifCours.domain.services;

import com.isms.planifCours.domain.services.IService.IAdmin;
import com.isms.planifCours.entity.AnneeScolaire;
import com.isms.planifCours.entity.Etudiant;
import com.isms.planifCours.entity.Professeur;
import com.isms.planifCours.entity.Salle;
import com.isms.planifCours.repository.AnneeScolaireRepository;
import com.isms.planifCours.repository.EtudiantRepository;
import com.isms.planifCours.repository.ProfesseurRepository;
import com.isms.planifCours.repository.SalleRepository;
import org.springframework.stereotype.Service;


@Service
public class AdminService implements IAdmin {
    private EtudiantRepository etudiantRepository;
    private ProfesseurRepository professeurRepository;
    private AnneeScolaireRepository anneeScolaireRepository;
    private SalleRepository salleRepository;

    public AdminService(EtudiantRepository etudiantRepository, ProfesseurRepository professeurRepository,AnneeScolaireRepository anneeScolaireRepository,SalleRepository salleRepository) {
        this.etudiantRepository = etudiantRepository;
        this.professeurRepository = professeurRepository;
        this.anneeScolaireRepository = anneeScolaireRepository;
        this.salleRepository = salleRepository;
    }

    @Override
    public void inscrireEtudiant() {

    }

    @Override
    public void creerEtudiant(Etudiant etudiant) {
        this.etudiantRepository.save(etudiant);
    }

    @Override
    public void creerProfesseur(Professeur professeur) {
        this.professeurRepository.save(professeur);
    }

    @Override
    public void creerSemestre(AnneeScolaire anneeScolaire) {
        this.anneeScolaireRepository.save(anneeScolaire);
    }

    @Override
    public void ajouterNouveauProfesseur() {

    }

    @Override
    public void creerSalle(Salle salle) {
        this.salleRepository.save(salle);
    }

    @Override
    public void creerAnneeScolaire(AnneeScolaire anneeScolaire) {
        this.anneeScolaireRepository.save(anneeScolaire);
    }
}
