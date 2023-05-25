package com.isms.planifCours.repository;

import com.isms.planifCours.entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours,Long> {
}
