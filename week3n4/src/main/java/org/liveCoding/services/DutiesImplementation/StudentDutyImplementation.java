package org.liveCoding.services.DutiesImplementation;


import org.liveCoding.models.Courses;
import org.liveCoding.models.Student;
import org.liveCoding.services.StudentDuties;

public class StudentDutyImplementation implements StudentDuties {
    public StudentDutyImplementation() {
    }

    @Override
    public String studentCanTakeCourse(Student student, Courses courses) {
        if(student.getClasses() == courses.getClasses()){
            return "You are eligible to take this course";
        }else{
            return "Pls can you go back to your class now";
        }

    }
}
