package org.springcourse.config;

import org.springcourse.Computer;
import org.springcourse.Music;
import org.springcourse.MusicPlayer;
import org.springcourse.genres.ClassicalMusic;
import org.springcourse.genres.RnBMusic;
import org.springcourse.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("org.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RnBMusic rnBMusic(){
        return new RnBMusic();
    }

    @Bean
    public List<Music> genresMusic(){
        return Arrays.asList(classicalMusic(), rnBMusic(), rockMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(genresMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
