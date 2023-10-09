package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

@SpringBootTest
class propertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;
    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}