package org.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vadim Naumov
 */
@Component
public class ClassicalMusic implements Music {

    List<String> classicSongs = new ArrayList<>();

    @Override
    public List<String> getSong() {
        addSong();
        return classicSongs;
    }

    @Override
    public void addSong() {
        classicSongs.add("Toccata and Fugue in D minor");
        classicSongs.add("Symphony No.5 in C minor");
        classicSongs.add("The Four Seasons");
    }
}
