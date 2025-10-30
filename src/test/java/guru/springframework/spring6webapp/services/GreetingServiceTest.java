package guru.springframework.spring6webapp.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class GreetingServiceTest {


    @Test
    void testInjectedOrdinary(@Qualifier("greetingServiceImpl") GreetingService sut) {
        System.out.println(sut.sayGreeting());
    }

    @Test    
    void testInjectedRemote(@Qualifier("remoteGreetingServiceImpl") GreetingService sut) {
        System.out.println(sut.sayGreeting());
    }

}
