package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

@SpringBootTest
class SetterInjectedControllerTest {
    @Autowired
    SetterInjectedController setterInjectedController;

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}