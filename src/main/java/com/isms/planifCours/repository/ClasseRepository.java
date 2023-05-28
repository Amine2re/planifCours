package com.isms.planifCours.repository;

import com.isms.planifCours.entity.Classe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClasseRepository extends CrudRepository<Classe,Long> {

    @Query("select cls from Classe cls where cls.id = cls.id")
    Optional<List<Classe>> findAllClasse();
}
