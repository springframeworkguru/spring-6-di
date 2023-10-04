package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {
    @Test
    void sayHello(){
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }

}