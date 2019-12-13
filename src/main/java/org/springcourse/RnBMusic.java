package org.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Vadim Naumov
 */
//@Component
public class RnBMusic implements Music  {
    @Override
    public String getSong() {
        return "Be Honest";
    }
}
