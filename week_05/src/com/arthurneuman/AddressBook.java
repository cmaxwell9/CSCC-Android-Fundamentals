package com.arthurneuman;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    AddressBook() {
        contacts = new ArrayList<>();
    }

    public String searchByName(String name) {
        for (Contact contactInfo: contacts) {
            if (contactInfo.getName().equals(name)) {
                return contactInfo.getEmail();
            }
        }
        return null;
    }

    public void newContact(String name, String email) {
        Contact aNewContact = new Contact(name, email);
        contacts.add(aNewContact);
    }


}
