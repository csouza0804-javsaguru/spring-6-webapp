package guru.springframework.spring6webapp.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    
    public String sayHello() {
        System.out.println("I'm on say Hello controller");

        return "Hello from Controller";
    }
}
