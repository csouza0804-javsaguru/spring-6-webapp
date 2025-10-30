package guru.springframework.spring6webapp.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.spring6webapp.services.GreetingService;

@Controller("/greeting")
public class GreetingController {
    
    private final GreetingService greetingService;

    public GreetingController(@Qualifier("remoteGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/")
    public String getMethodName() {
        return greetingService.sayGreeting();
    }
    
}
