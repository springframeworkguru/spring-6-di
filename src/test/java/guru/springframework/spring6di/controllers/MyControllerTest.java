package guru.springframework.spring6di.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyControllerTest {
    @Test
    void testSayHello() {

        MyController myController = new MyController();

        System.out.println(myController.sayHello());

        assertEquals("Hello everyone from base service (GreetingServiceImpl.sayGreeting)!!!", myController.sayHello());

    }
}
