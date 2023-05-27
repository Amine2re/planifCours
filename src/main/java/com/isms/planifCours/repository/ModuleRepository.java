package com.isms.planifCours.repository;

import com.isms.planifCours.entity.Module;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends CrudRepository<Module,Long> {
}
