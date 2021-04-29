package com.entities;

public class Instructor extends User{
    private String courseGiven;
    private double rating;

    public Instructor(){
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void signIn() {
        System.out.println("Signed in as Instructor");
    }

    @Override
    public void signOut() {
        System.out.println("Instructor signed out.");
    }

    @Override
    public void removeAccount() {
        this.surname = this.name = this.courseGiven = this.email = this.password = null;
        this.rating = Double.MIN_VALUE;
        this.id = Integer.MIN_VALUE;
        System.out.println("Instructor account removed successfully.");
    }

    public Instructor(int id, String name, String surname, String email, String password, String courseGiven, double rating){
        super(id, name, surname, email, password);
        if (rating > 5d)
            throw new IllegalArgumentException("Instructor cannot be initialized.Rating must be less than or equal to 5");

        this.courseGiven = courseGiven;
    }

    public String getCourseGiven() {
        return courseGiven;
    }

    public void setCourseGiven(String courseGiven) {
        this.courseGiven = courseGiven;
    }

    public double getRating() {
        return rating;
    }

}
