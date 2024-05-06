package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingsService;
import guru.springframework.spring6di.services.impl.GreetingsServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    
    private final GreetingsService greetingsService;

    public MyController() {
        this.greetingsService = new GreetingsServiceImpl() {};
    }

    public String sayHello() {
        System.out.println("I'm the MyController!!");
        
        return this.greetingsService.sayHello();
    }
}
