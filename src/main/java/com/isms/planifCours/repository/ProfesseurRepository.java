package com.isms.planifCours.repository;

import com.isms.planifCours.entity.Professeur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurRepository extends CrudRepository<Professeur,Long> {
}
