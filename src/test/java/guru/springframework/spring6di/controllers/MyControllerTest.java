package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void seyHello() {

        MyController myController = new MyController();

        System.out.println(myController.SeyHello());

    }
}