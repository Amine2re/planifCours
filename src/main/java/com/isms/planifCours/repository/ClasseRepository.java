package com.isms.planifCours.repository;

import com.isms.planifCours.entity.Classe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseRepository extends CrudRepository<Classe,Long> {
}
