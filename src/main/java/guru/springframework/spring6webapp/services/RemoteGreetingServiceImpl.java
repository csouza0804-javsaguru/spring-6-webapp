package guru.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

@Service
public class RemoteGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Saying out lound from remote";
    }
    
}
