package org.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Vadim Naumov
 */
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

    private List<Music> musicList;

    public MusicPlayer(List<Music> ara) {
        this.musicList = ara;
    }

    public String playMusic() {
        Random random = new Random();
        int x = random.nextInt(3);
        return "Playing: " + musicList.get(x).getSong() + " with volume " + this.volume;
    }

}
