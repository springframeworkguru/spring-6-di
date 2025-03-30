package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

/**
 * Created by jt, Spring Framework Guru.
 */
public class SetterInjectedController {
    private GreetingService greetingService;
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
