package guru.springframework.spring6webapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        // TODO Auto-generated method stub
        return  "Hello God!";
    }
    
}
