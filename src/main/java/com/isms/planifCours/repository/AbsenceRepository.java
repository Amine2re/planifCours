package com.isms.planifCours.repository;

import com.isms.planifCours.entity.Absence;
import com.isms.planifCours.entity.Etudiant;
import com.isms.planifCours.entity.SessionCours;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbsenceRepository extends CrudRepository<Absence,Long> {
    List<Absence> findByEtudiant(Etudiant etudiant);
    List<Absence> findBySessionCours(SessionCours sessionCours);
    List<Absence> findAbsencesByCoursId(Long coursId);
    List<Absence> findByProfesseurId(Long professeurId);
}
