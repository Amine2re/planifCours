package com.isms.planifCours.services;

import com.isms.planifCours.entity.Absence;
import com.isms.planifCours.entity.Etudiant;
import com.isms.planifCours.entity.SessionCours;
import com.isms.planifCours.repository.AbsenceRepository;
import com.isms.planifCours.repository.EtudiantRepository;
import com.isms.planifCours.repository.SessionCoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class GestionAbscencesService {

    @Autowired
    private SessionCoursRepository sessionCoursRepository;

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    private AbsenceRepository absenceRepository;

    public void marquerPresence(Long etudiantId, Long sessionCoursId) {
        Etudiant etudiant = etudiantRepository.findById(etudiantId)
                .orElseThrow(() -> new EntityNotFoundException("Etudiant not found"));
        SessionCours sessionCours = sessionCoursRepository.findById(sessionCoursId)
                .orElseThrow(() -> new EntityNotFoundException("SessionCours not found"));

        Absence absence = new Absence(etudiant, sessionCours);
        absenceRepository.save(absence);
    }

    public List<Absence> getAbsencesByEtudiantId(Long etudiantId) {
        Etudiant etudiant = etudiantRepository.findById(etudiantId)
                .orElseThrow(() -> new EntityNotFoundException("Etudiant not found"));
        return absenceRepository.findByEtudiant(etudiant);
    }

    public List<Absence> getAbsencesBySessionCoursId(Long sessionCoursId) {
        SessionCours sessionCours = sessionCoursRepository.findById(sessionCoursId)
                .orElseThrow(() -> new EntityNotFoundException("SessionCours not found"));
        return absenceRepository.findBySessionCours(sessionCours);
    }

    public void justifierAbsence(Long absenceId, String justification) {
        Absence absence = absenceRepository.findById(absenceId)
                .orElseThrow(() -> new EntityNotFoundException("Absence not found"));

        absence.setJustification(justification);
        absenceRepository.save(absence);
    }
}
