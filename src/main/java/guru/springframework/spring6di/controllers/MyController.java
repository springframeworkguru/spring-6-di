package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.*;
import org.springframework.stereotype.*;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I`m in controller");

        return greetingService.sayGreeting();
    }
}
