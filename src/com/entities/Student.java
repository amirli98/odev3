package com.entities;

public class Student extends User{
    private String coursesTaken;
    private int numberOfCourses;

    public Student(){
        super();
    }

    @Override
    public void signIn() {
        System.out.println("Signed in as Student.");
    }

    @Override
    public void signOut() {
        System.out.println("Student signed out");
    }

    @Override
    public void removeAccount() {
        this.coursesTaken = this.email = this.name = this.surname = this.password = null;
        this.numberOfCourses = Integer.MIN_VALUE;
        this.id = Integer.MIN_VALUE;
        System.out.println("Student account removed successfully.");
    }

    public Student(int id, String name, String surname, String email, String password, String coursesTaken, int numberOfCourses) {
        super(id, name, surname, email, password);
        this.coursesTaken = coursesTaken;
        this.numberOfCourses = numberOfCourses;
    }

    public String getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(String coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
