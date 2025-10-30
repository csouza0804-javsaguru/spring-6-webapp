package guru.springframework.spring6webapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import guru.springframework.spring6webapp.services.GreetingService;
import guru.springframework.spring6webapp.services.GreetingServiceImpl;

@Controller
public class MyController {

    @Value("${customproperty.name}")
    private String propertyName;

    private final GreetingService greetingService;
    
    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm on say Hello controller");

        return greetingService.sayGreeting();
    }

    public String getPropName() {
        return propertyName;
    }
}
