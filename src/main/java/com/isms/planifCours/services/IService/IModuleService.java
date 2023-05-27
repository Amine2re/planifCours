package com.isms.planifCours.services.IService;

import com.isms.planifCours.entity.Semestre;
import com.isms.planifCours.entity.SessionCours;

import java.util.List;

public interface IModuleService {

    void creerModule(Module module, Long coursId);
    void getModuleById(Long moduleId);
    void planifierModule(Semestre semestre, List<Module> modules);
}
