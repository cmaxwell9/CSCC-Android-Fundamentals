package com.arthurneuman;

enum Direction {North, South, East, West};

class Storm {
    private double latitude;
    private double longitude;
    private double speed;
    private Direction direction;

    Storm (){
    }

    Storm(double latitude, double longitude, double speed, Direction direction) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
        this.direction = direction;
    }

    // region - getters and setters
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    // endregion

    public void display() {
        System.out.println("The storm currently located at ("
                + latitude + ", " + longitude + ") is moving "
                + speed + "MPH " + direction + ".");
    }
}

class ThunderStorm extends Storm {
    private int numberOfLightningStrikes;

    public int getNumberOfLightningStrikes() {
        return numberOfLightningStrikes;
    }

    public void setNumberOfLightningStrikes(int numberOfLightningStrikes) {
        this.numberOfLightningStrikes = numberOfLightningStrikes;
    }

    ThunderStorm(double latitude, double longitude, double speed,
                 Direction direction, int numberOfLightningStrikes){
        super(latitude, longitude, speed, direction);
        this.numberOfLightningStrikes = numberOfLightningStrikes;

    }

    @Override
    public void display() {
        super.display();

        String message;
        if (numberOfLightningStrikes == 1) {
            message = "There has been one lightning strike ";
        }
        else
        {
            message = "There have been " + numberOfLightningStrikes
                    + " lightning strikes ";
        }
        message += "for the storm at (" + getLatitude() + ", " + getLongitude() + ").";
        System.out.println(message);
    }

    public void display(String message){
        display();
        System.out.println(message);
    }
}

public class Main {
    public static void main(String[] args) {
        ThunderStorm thunderStorm = new ThunderStorm(39.970, -82.989, 5,
                Direction.East, 20);
        thunderStorm.display("This is a message.");
    }
}
