package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jt, Spring Framework Guru.
 */
@Controller
public class PropertyInjectedController {
    @Autowired
    GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
