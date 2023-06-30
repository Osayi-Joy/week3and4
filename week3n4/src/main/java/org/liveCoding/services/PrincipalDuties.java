package org.liveCoding.services;


import org.liveCoding.models.Applicant;
import org.liveCoding.models.Principal;
import org.liveCoding.models.Student;

public interface PrincipalDuties {
    String admitApplicant(Applicant applicant, Principal principal);

    String expelStudent(Principal principal, Student student);
}
