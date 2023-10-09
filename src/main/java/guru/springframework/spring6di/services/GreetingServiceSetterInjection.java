package guru.springframework.spring6di.services;

import org.springframework.stereotype.*;

@Service
public class GreetingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey I`m setting a greeting;";
    }
}
