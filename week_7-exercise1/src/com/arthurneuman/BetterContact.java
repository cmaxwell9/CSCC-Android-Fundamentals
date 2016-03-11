package com.arthurneuman;

/**
 * Created by aneuman1 on 3/10/2016.
 */
public class BetterContact {
    private Contact contactField;
    private String phoneNumber;

    BetterContact(String name, String email, String phoneNumber) {
        contactField = new Contact(name, email);
        this.phoneNumber = phoneNumber;
    }

    public void display(){
        contactField.display();
    }

    public String getName() {
        return contactField.getName();
    }
    public void sendEmail(String message) {
        // code to send email
        // call contactField methods
    }
}
