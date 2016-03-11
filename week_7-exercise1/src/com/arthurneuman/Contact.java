package com.arthurneuman;

/**
 * Created by aneuman1 on 3/10/2016.
 */
public class Contact {
    private String name;
    private String email;

    Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
