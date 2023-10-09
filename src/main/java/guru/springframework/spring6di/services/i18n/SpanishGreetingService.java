package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Service("i18NService")
@Profile("ES")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
