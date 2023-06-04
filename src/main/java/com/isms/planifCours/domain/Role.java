package com.isms.planifCours.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.NaturalId;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.isms.planifCours.domain.Permission.ADMIN_CREATE;
import static com.isms.planifCours.domain.Permission.ADMIN_DELETE;
import static com.isms.planifCours.domain.Permission.ADMIN_READ;
import static com.isms.planifCours.domain.Permission.ADMIN_UPDATE;
import static com.isms.planifCours.domain.Permission.MANAGER_CREATE;
import static com.isms.planifCours.domain.Permission.MANAGER_DELETE;
import static com.isms.planifCours.domain.Permission.MANAGER_READ;
import static com.isms.planifCours.domain.Permission.MANAGER_UPDATE;

@Builder
@Entity
@Getter
@Table(name = "roles")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;
}