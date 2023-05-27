package com.isms.planifCours.domain.services;

import com.isms.planifCours.domain.services.IService.IAdmin;
import com.isms.planifCours.entity.*;
import com.isms.planifCours.repository.*;
import org.springframework.stereotype.Service;


@Service
public class AdminService implements IAdmin {
    private EtudiantRepository etudiantRepository;
    private ProfesseurRepository professeurRepository;
    private AnneeScolaireRepository anneeScolaireRepository;
    private SalleRepository salleRepository;
    private SalleRepository coursRepository;

    public AdminService(EtudiantRepository etudiantRepository, ProfesseurRepository professeurRepository, AnneeScolaireRepository anneeScolaireRepository, SalleRepository salleRepository, SalleRepository coursRepository) {
        this.etudiantRepository = etudiantRepository;
        this.professeurRepository = professeurRepository;
        this.anneeScolaireRepository = anneeScolaireRepository;
        this.salleRepository = salleRepository;
        this.coursRepository = coursRepository;
    }

    @Override
    public void inscrireEtudiant(Etudiant etudiant) {
        /* TODO
            creer etudiant
            Ne pas lui assigner un cours
         */

        this.creerEtudiant(etudiant);
        this.assignerCoursToEtudiant(0L,etudiant);

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

    @Override
    public void assignerCoursToEtudiant(Long idCours,Etudiant etudiant) {
        /* TODO
            rechercher cours by Id et l'assigner à l'etudiant
         */

        var coursFound = coursRepository.findById(idCours).orElseThrow(()-> new RuntimeException("cours non trouvé"));
        //etudiant.setCours(); // todo asigner cours à l'etudiant
        //update etudiant
        etudiantRepository.save(etudiant);

    }

    @Override
    public void planifierSession(Long idCours, Long idSession) {

    }

    @Override
    public void annulerSession(Long idSession) {

    }

    @Override
    public void filtrerSession(String type, Long idSession) {

    }

    @Override
    public void filtrerCours(String type, Long idSession) {

    }

    @Override
    public void listerCours(String type, Long idSession) {

    }

    @Override
    public void listerEtudiant(String type, Long idSession) {

    }

    @Override
    public void demandeAnnulationCours(Cours cours, Professeur professeur) {

    }

    @Override
    public void validerSessionCours(Professeur professeur, Long idCours) {

    }
}
