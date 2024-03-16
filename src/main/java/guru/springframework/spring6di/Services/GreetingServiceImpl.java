package guru.springframework.spring6di.Services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String seyGreeting() {
        return "Hello Everyone From Base Service";
    }
}
