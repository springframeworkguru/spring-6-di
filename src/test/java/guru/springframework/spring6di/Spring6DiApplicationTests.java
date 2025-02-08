package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {
    
    @Autowired
    private ApplicationContext context;
    
    @Autowired
    private MyController myController;
    
    @Test
    void myControllerAutowired() {
        System.out.println(this.myController.sayHello());
    }

    @Test
    void applicationContextAutowired() {
        final var controller = this.context.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }
    
    @Test
    void contextLoads() {
    }

}
