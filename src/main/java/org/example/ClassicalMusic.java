package org.example;


import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    String[] classicalSongs = {"Bethoven - Moonlight sonata",
            "Greeg - Hall of the Mountain King",
            "Bach – Toccata and Fugue in D minor"};

    @Override
    public String getSong() {
        int randomDigit = (int) (Math.random() * 3);
        return classicalSongs[randomDigit];
    }

}
