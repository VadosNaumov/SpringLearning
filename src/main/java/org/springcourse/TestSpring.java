package org.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vadim Naumov
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(GenresMusic.CLASSICAL);
        musicPlayer.playMusic(GenresMusic.ROCK);
        musicPlayer.playMusic(GenresMusic.RNB);

        context.close();
    }
}
