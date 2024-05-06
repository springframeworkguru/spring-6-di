package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        final var context = SpringApplication.run(Spring6DiApplication.class, args);

        System.out.println("Hello from the Main");

        final var myController = context.getBean(MyController.class);
        
        System.out.println(myController.sayHello());
    }

}
