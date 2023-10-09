package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;
    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}