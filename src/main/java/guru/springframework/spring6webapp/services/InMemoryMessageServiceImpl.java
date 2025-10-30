package guru.springframework.spring6webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("local")
public class InMemoryMessageServiceImpl implements MessageService{

    @Override
    public void Publish(String message) {
        System.out.println("publishing locally in memory " + message);
    }
    
}
