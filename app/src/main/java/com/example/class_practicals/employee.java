package com.example.class_practicals;

public class employee {
    int img;
    int firstname;
    int lastname;

    public employee(int img, int firstname, int lastname) {
        this.img = img;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getFirstname() {
        return firstname;
    }

    public void setFirstname(int firstname) {
        this.firstname = firstname;
    }

    public int getLastname() {
        return lastname;
    }

    public void setLastname(int lastname) {
        this.lastname = lastname;
    }
}
