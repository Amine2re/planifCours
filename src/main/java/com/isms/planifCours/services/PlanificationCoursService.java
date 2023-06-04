package com.isms.planifCours.services;

import com.isms.planifCours.entity.*;
import com.isms.planifCours.entity.Module;
import com.isms.planifCours.repository.*;
import com.isms.planifCours.services.IService.ISessionCoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class PlanificationCoursService  {

    @Autowired
    private AnneeScolaireRepository anneeScolaireRepository;

    @Autowired
    private ClasseRepository classeRepository;

    @Autowired
    private ProfesseurRepository professeurRepository;

    @Autowired
    private SalleRepository salleRepository;

    @Autowired
    private SemestreRepository semestreRepository;

    @Autowired
    private ModuleRepository moduleRepository;

    @Autowired
    private CoursRepository coursRepository;

    @Autowired
    private SessionCoursRepository sessionCoursRepository;

    @Autowired
    private EtudiantRepository etudiantRepository;

    public AnneeScolaire createAnneeScolaire(AnneeScolaire anneeScolaire) {
        return anneeScolaireRepository.save(anneeScolaire);
    }

    public AnneeScolaire getAnneeScolaireById(Long anneeScolaireId) {
        return anneeScolaireRepository.findById(anneeScolaireId)
                .orElseThrow(() -> new EntityNotFoundException("AnneeScolaire not found"));
    }

    public Classe createClasse(Classe classe) {
        return classeRepository.save(classe);
    }

    public Classe getClasseById(Long classeId) {
        return classeRepository.findById(classeId)
                .orElseThrow(() -> new EntityNotFoundException("Classe not found"));
    }

    public void planifierClasses(AnneeScolaire anneeScolaire, List<Classe> classes) {
        anneeScolaire.setClasses(classes);
        anneeScolaireRepository.save(anneeScolaire);
    }

    public Professeur createProfesseur(Professeur professeur) {
        return professeurRepository.save(professeur);
    }

    public Professeur getProfesseurById(Long professeurId) {
        return professeurRepository.findById(professeurId)
                .orElseThrow(() -> new EntityNotFoundException("Professeur not found"));
    }

    public void addProfesseurToClasse(Long professeurId, Long classeId) {
        Professeur professeur = professeurRepository.findById(professeurId)
                .orElseThrow(() -> new EntityNotFoundException("Professeur not found"));
        Classe classe = classeRepository.findById(classeId)
                .orElseThrow(() -> new EntityNotFoundException("Classe not found"));

        classe.addProfesseur(professeur);
        classeRepository.save(classe);
    }

    public Salle createSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    public Salle getSalleById(Long salleId) {
        return salleRepository.findById(salleId)
                .orElseThrow(() -> new EntityNotFoundException("Salle not found"));
    }

    public void addSalleToClasse(Long salleId, Long classeId) {
        Salle salle = salleRepository.findById(salleId)
                .orElseThrow(() -> new EntityNotFoundException("Salle not found"));
        Classe classe = classeRepository.findById(classeId)
                .orElseThrow(() -> new EntityNotFoundException("Classe not found"));

        classe.setSalle(salle);
        classeRepository.save(classe);
    }

    public Semestre createSemestre(Semestre semestre) {
        return semestreRepository.save(semestre);
    }

    public Semestre getSemestreById(Long semestreId) {
        return semestreRepository.findById(semestreId)
                .orElseThrow(() -> new EntityNotFoundException("Semestre not found"));
    }

    public Module createModule(Module module) {
        return moduleRepository.save(module);
    }

    public Module getModuleById(Long moduleId) {
        return moduleRepository.findById(moduleId)
                .orElseThrow(() -> new EntityNotFoundException("Module not found"));
    }

    public Cours createCours(Cours cours) {
        return coursRepository.save(cours);
    }

    public Cours getCoursById(Long coursId) {
        return coursRepository.findById(coursId)
                .orElseThrow(() -> new EntityNotFoundException("Cours not found"));
    }

    public void planifierSessionCours(SessionCours sessionCours) {
        sessionCoursRepository.save(sessionCours);
    }

    public SessionCours getSessionCoursById(Long sessionCoursId) {
        return sessionCoursRepository.findById(sessionCoursId)
                .orElseThrow(() -> new EntityNotFoundException("SessionCours not found"));
    }

    public SessionCours createSessionCours(SessionCours sessionCours){
        return sessionCoursRepository.save(sessionCours);
    }

    public void inscrireEtudiants(Long classeId, List<Long> etudiantIds) {
        Optional<Classe> optionalClasse = classeRepository.findById(classeId);
        if (optionalClasse.isPresent()) {
            Classe classe = optionalClasse.get();
            Iterable<Etudiant> etudiants = etudiantRepository.findAllById(etudiantIds);
            for (Etudiant etudiant : etudiants) {
                etudiant.setClasse(classe);
            }
            etudiantRepository.saveAll(etudiants);
        } else {
            throw new EntityNotFoundException("Classe not found with ID: " + classeId);
        }
    }

    public List<Cours> getCoursByProfesseur(Long professeurId) {
        Optional<Professeur> optionalProfesseur = professeurRepository.findById(professeurId);
        if (optionalProfesseur.isPresent()) {
            Professeur professeur = optionalProfesseur.get();
            return coursRepository.findByProfesseur(professeur);
        } else {
            throw new EntityNotFoundException("Professeur not found with ID: " + professeurId);
        }
    }

    public List<Classe> getAllClasses() {
        return (List<Classe>) classeRepository.findAll();
    }

    public List<AnneeScolaire> getAllAnneeScolaire() {
        return (List<AnneeScolaire>) anneeScolaireRepository.findAll();
    }

}
