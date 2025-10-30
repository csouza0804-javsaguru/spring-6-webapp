package guru.springframework.spring6webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
public class RabbitMessageServiceImpl implements MessageService{

    @Override
    public void Publish(String message) {
        System.out.println("Publishing remote " + message);
    }
    
}
