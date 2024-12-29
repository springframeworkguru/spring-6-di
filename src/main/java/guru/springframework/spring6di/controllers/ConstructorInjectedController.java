package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.GreetingService;


public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
