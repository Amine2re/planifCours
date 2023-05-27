package com.isms.planifCours.repository;

import com.isms.planifCours.entity.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant,Long> {
}
