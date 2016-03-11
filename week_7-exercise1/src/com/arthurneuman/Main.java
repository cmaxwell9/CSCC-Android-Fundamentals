package com.arthurneuman;

/**
 * Created by aneuman1 on 3/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        Contact arthur = new Contact("Arthur", "aneuman1@cscc.edu");
        arthur.display();

        BusinessContact bob = new BusinessContact("Bob", "bob@bob.com", "123-456-7890");
        bob.display();
    }
}
