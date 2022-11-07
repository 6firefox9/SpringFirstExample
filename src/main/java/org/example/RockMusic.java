package org.example;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{

    private String[] rockSongs = {"Godsmack - I stand alone" ,
            "SOAD - Dreaming" , "Linkin park - Breaking the habits"};


    @Override
    public String getSong() {
        int randomDigit = (int) (Math.random() * 3);
        return rockSongs[randomDigit];
    }
}
