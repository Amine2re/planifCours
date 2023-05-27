package com.isms.planifCours.services.IService;

import java.io.File;

public interface IEtudiantService {
    void importEtudiantsFromExcel(File excelFile);
    void getEtudiantById(Long etudiantId);
}
