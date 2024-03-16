package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.Services.GreetingService;
import guru.springframework.spring6di.Services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String SeyHello(){



        System.out.println("I am in controller");

        return greetingService.seyGreeting();

    }
}
