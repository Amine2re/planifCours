package com.isms.planifCours.rest.sec.user;

import com.isms.planifCours.domain.services.AdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("User")
public class UserController {

    private AdminService adminService;


    public UserController(AdminService adminService) {
        this.adminService = adminService;
    }

  //  @PostMapping("")
   // public void creerEtudiant
   // public void creerEtudiant
}
