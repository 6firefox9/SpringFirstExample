package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2){
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(Genres genre) {
        if (genre == Genres.ROCK){
            music1.getSong();
            System.out.println("Playing - " + music1.getSong());
        } else if (genre == Genres.CLASSICAL){
            music2.getSong();
            System.out.println("Playing - " + music2.getSong());
        }

    }
}
