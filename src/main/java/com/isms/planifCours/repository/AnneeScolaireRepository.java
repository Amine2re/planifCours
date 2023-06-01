package com.isms.planifCours.repository;

import com.isms.planifCours.entity.AnneeScolaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnneeScolaireRepository extends JpaRepository<AnneeScolaire,Long> {
    @Query("select an from AnneeScolaire an where an.id = an.id")
    List<AnneeScolaire> findAllAnneeScolaires();
}
