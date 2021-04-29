package com.managers;

import com.entities.Instructor;

public class InstructorManager extends UserManager{

    public void addNewInstructor(Instructor instructor){
        System.out.println(instructor.getName() + "added recently.");
    }
}
