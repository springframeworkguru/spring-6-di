package guru.springframework.spring6di.services;

import org.springframework.stereotype.*;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Friends do not let friends to property injection";
    }
}
