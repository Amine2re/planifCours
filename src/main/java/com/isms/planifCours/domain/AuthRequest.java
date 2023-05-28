package com.isms.planifCours.domain;

import com.sun.istack.NotNull;
import javax.validation.constraints.Email;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class AuthRequest {
    @NotNull
    @Email @Length(min = 5, max = 50)
    private String email;

    @NotNull @Length(min = 5, max = 10)
    private String password;
}
