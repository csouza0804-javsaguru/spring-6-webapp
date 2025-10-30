package guru.springframework.spring6webapp.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("local")
public class LocalMessageServiceTest {

    @Autowired
    private MessageService sut;

    @Test
    void testFromLocalMessageService() {
        sut.Publish("Tennis is the best sport!");
    }
    
}
