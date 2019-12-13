package org.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Vadim Naumov
 */
@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
