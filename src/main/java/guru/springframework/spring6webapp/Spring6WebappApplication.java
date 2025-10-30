package guru.springframework.spring6webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.spring6webapp.controller.MyController;

@SpringBootApplication
public class Spring6WebappApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6WebappApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);
        System.out.println("In MAin method");

        controller.sayHello();
        System.out.println(controller.getPropName());
    }

}
