package guru.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

@SpringBootTest
class Myi18NControllerTest {
    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayHello(){
        System.out.println(myi18NController.sayHello());
    }
}