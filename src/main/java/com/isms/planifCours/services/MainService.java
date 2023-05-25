package com.isms.planifCours.services;

import com.isms.planifCours.domain.services.AdminService;
import org.springframework.stereotype.Service;

@Service
public class MainService  {

    private final AdminService adminService;
    private final PlanificationService planificationService;

    public MainService(AdminService adminService,PlanificationService planificationService) {
        this.adminService = adminService;
        this.planificationService = planificationService;
    }



}
