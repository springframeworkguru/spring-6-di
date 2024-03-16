package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingService;

public class ConstructorInjectController {
    private final GreetingService greetingService;

    public ConstructorInjectController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
