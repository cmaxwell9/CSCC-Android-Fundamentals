package com.arthurneuman;

public class Main {

    public static void main(String[] args){
        UserInput input = new UserInput();
        double aNumber = input.promptDouble("Enter an double.");
        System.out.println("Twice your number is " + 2 * aNumber);
    }
}
