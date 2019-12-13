package org.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Vadim Naumov
 */
@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic")Music music2,
                       @Qualifier("rnBMusic")Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public void playMusic(GenresMusic genre) {
        String song = "You didn't choose correct genre";
        Random random = new Random();
        int x = random.nextInt(3);

        switch (genre) {
            case CLASSICAL:
                song = "Playing CLASSICAL: " + music1.getSong().get(x);
                break;
            case ROCK:
                song = "Playing ROCK: " + music2.getSong().get(x);
                break;
            case RNB:
                song = "Playing RNB: " + music3.getSong().get(x);
                break;
        }
        System.out.println(song);
    }

}
