package com.isms.planifCours.repository;

import com.isms.planifCours.entity.Semestre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreRepository extends CrudRepository<Semestre,Long> {
}
