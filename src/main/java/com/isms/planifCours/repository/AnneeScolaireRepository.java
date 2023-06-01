package com.isms.planifCours.repository;

import com.isms.planifCours.entity.AnneeScolaire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnneeScolaireRepository extends CrudRepository<AnneeScolaire,Long> {
    //List<AnneeScolaire> findAllAnneeScolaire();
}
