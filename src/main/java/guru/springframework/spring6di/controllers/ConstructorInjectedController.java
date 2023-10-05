package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.*;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return  greetingService.sayGreeting();
    }
}
