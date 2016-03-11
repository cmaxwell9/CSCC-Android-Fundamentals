package com.arthurneuman;

/**
 * Created by aneuman1 on 3/10/2016.
 */

class Wheel {
    // wheel functionality
}

class Door {
    // door functionality
}

class Engine {
    // engine stuff
    public void turnOn() {
        // turn engine on
    }
}

public class Car {
    private Wheel wheel;
    private Door door;
    private Engine engine;

    public void turnOn() {
        engine.turnOn();

    }

}
