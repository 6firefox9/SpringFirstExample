package org.example;

public class RockMusic implements Music{
    @Override
    public void doMyInit() {
        System.out.println("Initialization " + getClass() + " Please wait...");
    }

    @Override
    public void doMyDestruction() {
        System.out.println("Destruction of " + getClass() + " Please wait...");
    }

    @Override
    public String getSong() {
        return "I stand alone";
    }
}
