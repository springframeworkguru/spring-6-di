package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyGreetingService")
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
