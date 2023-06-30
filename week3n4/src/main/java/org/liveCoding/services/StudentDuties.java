package org.liveCoding.services;


import org.liveCoding.models.Courses;
import org.liveCoding.models.Student;

public interface StudentDuties {
    String studentCanTakeCourse(Student student, Courses courses);

}