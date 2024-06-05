package tn.esprit;

// Importing necessary libraries
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

// Declaring the class as a Spring Boot application
@SpringBootApplication
// Enabling AspectJ-based proxying to support AOP (Aspect-Oriented Programming)
@EnableAspectJAutoProxy
// Enabling Spring's scheduled task execution capability
@EnableScheduling
public class TemplateApplication {

    // Main method to start the Spring Boot application
    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }
}
