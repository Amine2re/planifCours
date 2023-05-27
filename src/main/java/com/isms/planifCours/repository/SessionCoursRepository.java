package com.isms.planifCours.repository;

import com.isms.planifCours.entity.SessionCours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionCoursRepository extends CrudRepository<SessionCours,Long> {
}
