package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

/**
 * Created by jt, Spring Framework Guru.
 */
public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
