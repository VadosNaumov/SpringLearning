package org.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vadim Naumov
 */
public class MusicPlayer {

    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private int i = 1;
    private String name;
    private int volume;

    // IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playAllMusic() {
        for (Music element :musicList) {
            System.out.println("Playing: " + i++ + ". " + element.getSong());
        }
    }
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
}
