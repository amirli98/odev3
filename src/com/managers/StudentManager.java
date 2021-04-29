package com.managers;

import com.entities.Instructor;


public class StudentManager extends UserManager{
    public void addNewCourseFrom(Instructor instructor){
        System.out.println(instructor.getName() + " added new course " + instructor.getCourseGiven()+ " for students.Check it out");
    }
}
