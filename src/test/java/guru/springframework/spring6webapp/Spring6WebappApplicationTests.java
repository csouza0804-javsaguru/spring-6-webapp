package guru.springframework.spring6webapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import guru.springframework.spring6webapp.controller.MyController;

@SpringBootTest
class Spring6WebappApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController mController;

    @Test
    void testAutowiredController() {
        System.out.println(mController.sayHello());
    }

    @Test
    void testGetControllerFromContext() {
        MyController controller = applicationContext.getBean(MyController.class);

        System.out.println(controller.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
