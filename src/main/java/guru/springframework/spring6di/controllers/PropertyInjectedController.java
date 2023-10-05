package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.*;

public class PropertyInjectedController {
    GreetingService greetingService;
    public String sayHello(){
       return greetingService.sayGreeting();
    }
}
