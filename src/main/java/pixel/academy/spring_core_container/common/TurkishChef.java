package pixel.academy.spring_core_container.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TurkishChef implements Chef {

    public TurkishChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

        @Override
        public String getDailyRecipe () {
            return "Kebab- e bun!";
        }
    }
