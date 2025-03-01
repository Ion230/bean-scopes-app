package pixel.academy.spring_core_container.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FrenchChef implements Chef {

    public FrenchChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

        @Override
        public String getDailyRecipe () {
            return "Prepara tacos al pastor con pina, cilantro y salsa picante!";
        }
    }

