package org.springcourse.genres;

import org.springcourse.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vadim Naumov
 */
public class RockMusic implements Music {

    private List<String> rockSongs = new ArrayList<>();

    @Override
    public List<String> getSong() {
        addSong();
        return rockSongs;
    }

    @Override
    public void addSong() {
        rockSongs.add("Live wire");
        rockSongs.add("TNT");
        rockSongs.add("Sweet child O'Mine");
    }
}
