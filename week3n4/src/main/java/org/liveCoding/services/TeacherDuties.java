package org.liveCoding.services;


import org.liveCoding.models.Courses;
import org.liveCoding.models.Staff;

public interface TeacherDuties {
    public String teacherCanTeachACourse(String classes, Courses course, Staff teacher);
}
