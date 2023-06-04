package com.isms.planifCours.rest;

import com.isms.planifCours.dto.JwtAuthenticationResponse;
import com.isms.planifCours.dto.LoginRequest;
import com.isms.planifCours.dto.SignUpRequest;
import com.isms.planifCours.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/",maxAge = 3600)
public class AuthController {

    private AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signin")
    @ResponseStatus(OK)
    public JwtAuthenticationResponse login(@Valid @RequestBody LoginRequest loginRequest) {
        return authService.authenticateUser(loginRequest);
    }

    @PostMapping("/signup")
    @ResponseStatus(OK)
    public Long register(@Valid @RequestBody SignUpRequest signUpRequest) {
        return authService.registerUser(signUpRequest);
    }
}

