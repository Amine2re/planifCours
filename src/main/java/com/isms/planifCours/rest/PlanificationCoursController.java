package com.isms.planifCours.rest;

import com.isms.planifCours.entity.*;
import com.isms.planifCours.services.PlanificationCoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.isms.planifCours.entity.Module;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/planification")
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
public class PlanificationCoursController {

    @Autowired
    private PlanificationCoursService planificationCoursService;

    @PostMapping("/annee-scolaire")
    public AnneeScolaire createAnneeScolaire(@RequestBody AnneeScolaire anneeScolaire) {
        return planificationCoursService.createAnneeScolaire(anneeScolaire);
    }

    @PostMapping("/classe")
    public Classe createClasse(@RequestBody Classe classe) {
        return planificationCoursService.createClasse(classe);
    }

    @PostMapping("/professeur")
    public Professeur createProfesseur(@RequestBody Professeur professeur) {
        return planificationCoursService.createProfesseur(professeur);
    }

    @PostMapping("/salle")
    public Salle createSalle(@RequestBody Salle salle) {
        return planificationCoursService.createSalle(salle);
    }

    @PostMapping("/semestre")
    public Semestre createSemestre(@RequestBody Semestre semestre) {
        return planificationCoursService.createSemestre(semestre);
    }

    @PostMapping("/module")
    public Module createModule(@RequestBody Module module) {
        return planificationCoursService.createModule(module);
    }

    @PostMapping("/cours")
    public Cours createCours(@RequestBody Cours cours) {
        return planificationCoursService.createCours(cours);
    }

    @PostMapping("/session-cours")
    public SessionCours createSessionCours(@RequestBody SessionCours sessionCours) {
        return planificationCoursService.createSessionCours(sessionCours);
    }

    @PostMapping("/inscription-etudiant")
    public void inscrireEtudiants(@RequestParam Long classeId, @RequestBody List<Long> etudiantIds) {
        planificationCoursService.inscrireEtudiants(classeId, etudiantIds);
    }

    @GetMapping("/cours/{coursId}")
    public Cours getCoursById(@PathVariable Long coursId) {
        return planificationCoursService.getCoursById(coursId);
    }

    @GetMapping("/professeur/{professeurId}/cours")
    public List<Cours> getCoursByProfesseur(@PathVariable Long professeurId) {
        return planificationCoursService.getCoursByProfesseur(professeurId);
    }

    @GetMapping("/allClasses")
    public List<Classe> getAllClasses(){
        return planificationCoursService.getAllClasses();
    }

    @GetMapping("/allAnneeScolaire")
    public List<AnneeScolaire> getAllAnneeScolaire(){
        return planificationCoursService.getAllAnneeScolaire();
    }
}