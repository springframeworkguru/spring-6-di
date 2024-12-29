package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
