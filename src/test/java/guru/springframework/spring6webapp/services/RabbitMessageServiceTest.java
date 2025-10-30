package guru.springframework.spring6webapp.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RabbitMessageServiceTest {
    
    @Autowired
    private MessageService sut;


    @Test
    void testRabbitRemoteMessa() {
        sut.Publish("Alllllooooooou");
    }
}
