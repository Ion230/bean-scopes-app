package pixel.academy.spring_core_container.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class MexicanChef implements Chef {

    public MexicanChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

        @Override
        public String getDailyRecipe () {
            return "Prepara tacos al pastor con pina, cilantro y salsa picante!";
        }
    }

