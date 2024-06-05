package tn.esprit.Controller;

// Importing necessary libraries
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

// Custom service interface to be injected into the controller
import tn.esprit.Service.IExamenService;

// Declaring the class as a REST controller and adding a logger
@RestController

// Lombok annotation to automatically generate a logger field
@Slf4j

// Lombok annotation to generate an all-args constructor
@AllArgsConstructor

// Spring annotation for specifying the base URL path for all endpoints in the controller
@RequestMapping("Examen")
public class ExamenController {
    // Injecting the IExamenService dependency using constructor injection
    @Autowired
    IExamenService examenService;

    // Handling GET requests for the "/Examen/test" endpoint
    @GetMapping("test")
    public String test() {
        // Delegating the test method call to the injected service
        return examenService.test();
    }
}
