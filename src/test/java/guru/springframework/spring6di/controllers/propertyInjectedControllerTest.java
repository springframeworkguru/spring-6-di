package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class propertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;
    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}