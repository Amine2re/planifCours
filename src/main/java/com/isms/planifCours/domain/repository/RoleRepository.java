package com.isms.planifCours.domain.repository;

import com.isms.planifCours.domain.Role;
import com.isms.planifCours.domain.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}