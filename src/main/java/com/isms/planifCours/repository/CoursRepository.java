package com.isms.planifCours.repository;

import com.isms.planifCours.entity.Cours;
import com.isms.planifCours.entity.Professeur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursRepository extends CrudRepository<Cours,Long> {
    List<Cours> findByProfesseur(Professeur professeur);
}
