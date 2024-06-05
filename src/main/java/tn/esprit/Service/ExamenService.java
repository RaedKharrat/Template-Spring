package tn.esprit.Service;

// Importing necessary libraries
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.Repository.TestRepository;

// Declaring the class as a Spring service
@Service
// Generating an all-args constructor using Lombok
@AllArgsConstructor
// Adding a logger to the class
@Slf4j
// Implementing the IExamenService interface
public class ExamenService implements IExamenService {
    
    // Injecting the TestRepository dependency using constructor injection
    TestRepository testRepository;

    // Implementing the test method from the IExamenService interface
    @Override
    public String test() {
        // Returning a simple test message
        return "Hello Test";
    }
}
