package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class SetterInjectedController {
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("greetingServiceSetterInjection")
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("Hello from setter");
        this.greetingService = greetingService;
    }
}
