package com.arthurneuman;

/**
 * Created by aneuman1 on 3/10/2016.
 */
public class BusinessContact extends Contact {
    private String phoneNumber;

    BusinessContact(String name, String email, String phoneNumber){
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phone number: " + phoneNumber);
    }
}
