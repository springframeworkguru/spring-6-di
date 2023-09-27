package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.*;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("I`m in controller");

        return "Hello Everyone!!!";
    }
}
