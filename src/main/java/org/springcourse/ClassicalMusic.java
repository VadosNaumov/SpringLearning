package org.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vadim Naumov
 */
@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

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
