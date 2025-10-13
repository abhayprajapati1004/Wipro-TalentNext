package com.automobile;

public class Honda extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Honda(String modelName, String registrationNumber, String ownerName) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = 0; // Default speed
    }

    public String getModelName() {
        return modelName;
    }

 
    public String getRegistrationNumber() {
        return registrationNumber;
    }

 
    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return speed;
    }

    public void cdplayer() {
        System.out.println("CD Player is working.");
    }
}