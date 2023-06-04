package com.isms.planifCours.rest;

import com.isms.planifCours.entity.Absence;
import com.isms.planifCours.services.GestionAbscencesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/gestion-absences")
@CrossOrigin(origins = "http://localhost:4200/",maxAge = 3600)
public class GestionAbsencesController {

    @Autowired
    private GestionAbscencesService gestionAbsencesService;

    @PostMapping("/presence")
    public void marquerPresence(@RequestParam Long etudiantId, @RequestParam Long sessionCoursId) {
        gestionAbsencesService.marquerPresence(etudiantId, sessionCoursId);
    }

    @PostMapping("/absence/{absenceId}/justification")
    public void justifierAbsence(@PathVariable Long absenceId, @RequestBody String justification) {
        gestionAbsencesService.justifierAbsence(absenceId, justification);
    }

    @GetMapping("/etudiant/{etudiantId}/absences")
    public List<Absence> getAbsencesByEtudiant(@PathVariable Long etudiantId) {
        return gestionAbsencesService.getAbsencesByEtudiantId(etudiantId);
    }

        @GetMapping("/cours/{coursId}/absences")
    public List<Absence> getAbsencesByCours(@PathVariable Long coursId) {
        return gestionAbsencesService.getAbsencesByCours(coursId);
    }

    @GetMapping("/professeur/{professeurId}/absences")
    public List<Absence> getAbsencesByProfesseur(@PathVariable Long professeurId) {
        return gestionAbsencesService.getAbsencesByProfesseur(professeurId);
    }

    @GetMapping("/session-cours/{sessionCoursId}/absences")
    public List<Absence> getAbsencesBySessionCours(@PathVariable Long sessionCoursId) {
        return gestionAbsencesService.getAbsencesBySessionCoursId(sessionCoursId);
    }



}
