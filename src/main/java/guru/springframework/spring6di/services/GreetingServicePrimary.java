package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by jt, Spring Framework Guru.
 */
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From the Primary Bean!!";
    }
}
