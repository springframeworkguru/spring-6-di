package guru.springframework.spring6di.services.impl;

import guru.springframework.spring6di.services.GreetingsService;

public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayHello() {
        return "Hello from the Greetings Service";
    }
}
