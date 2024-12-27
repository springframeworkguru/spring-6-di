package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("I'm inside the controller");

        return "Hello Everyone";
    }

}
