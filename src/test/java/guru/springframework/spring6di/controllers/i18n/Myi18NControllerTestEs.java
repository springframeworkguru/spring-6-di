package guru.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.*;

@SpringBootTest
@ActiveProfiles("ES")
class Myi18NControllerTestEs {
    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayHello(){
        System.out.println(myi18NController.sayHello());
    }

}