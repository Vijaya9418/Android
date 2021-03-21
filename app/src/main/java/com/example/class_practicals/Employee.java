package com.example.class_practicals;

public class Employee {
    int img;
    String firstName,lastName;
    Employee(int img,String firstName, String lastName){
        this.img=img;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public int getImg() {
        return img;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
