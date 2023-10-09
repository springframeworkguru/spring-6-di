package guru.springframework.spring6di.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from primary bean";
    }
}
