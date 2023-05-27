package com.isms.planifCours.services.IService;

import com.isms.planifCours.entity.SessionCours;

public interface ISessionCoursService {

    void createSessionCours(SessionCours sessionCours);
    void getSessionCoursById(Long sessionCoursId);
    void markSessionCoursAsCompleted(Long sessionCoursId);
    void cancelSessionCours(Long sessionCoursId);
}

