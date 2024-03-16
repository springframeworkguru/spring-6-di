package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectControllerTest {

    ConstructorInjectController constructor;

    @BeforeEach
    void setUp() {
        constructor = new ConstructorInjectController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(this.constructor.sayHello());
    }
}