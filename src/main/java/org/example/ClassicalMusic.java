package org.example;

public class ClassicalMusic implements Music{

    private ClassicalMusic(){};

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Moonlight Sonata";
    }

    @Override
    public void doMyInit() {
        System.out.println("Initialization " + getClass() + " Please wait...");
    }

    @Override
    public void doMyDestruction() {
        System.out.println("Destruction of " + getClass() + " Please wait...");
    }
}
