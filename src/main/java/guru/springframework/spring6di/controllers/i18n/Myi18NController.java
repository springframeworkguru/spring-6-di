package guru.springframework.spring6di.controllers.i18n;

import guru.springframework.spring6di.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class Myi18NController {
    private final GreetingService greetingService;

    public Myi18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
