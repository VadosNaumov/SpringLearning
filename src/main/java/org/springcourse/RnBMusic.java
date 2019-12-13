package org.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vadim Naumov
 */
@Component
public class RnBMusic implements Music  {

    private List<String> rnbSongs = new ArrayList<>();

    @Override
    public List<String> getSong() {
        addSong();
        return rnbSongs;
    }

    @Override
    public void addSong() {
        rnbSongs.add("I Wanna Be Down");
        rnbSongs.add("Soon As I Get Home");
        rnbSongs.add("I’m Still In Love");
    }
}
