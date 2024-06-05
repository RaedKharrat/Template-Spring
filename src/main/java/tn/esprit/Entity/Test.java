package tn.esprit.Entity;

// Importing necessary libraries
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

// Declaring the class as a JPA entity, representing a table in the database
@Entity
// Generating default no-args constructor
@NoArgsConstructor
// Generating all-args constructor
@AllArgsConstructor
// Using Lombok's builder pattern for convenient object creation
@Builder
// Generating getter methods for all fields
@Getter
// Generating setter methods for all fields
@Setter
// Generating toString method for easy object representation
@ToString
// Setting field access level to private, using Lombok's @FieldDefaults
@FieldDefaults(level = AccessLevel.PRIVATE)
// Implementing the Serializable interface for object serialization
public class Test implements Serializable {

    // Declaring the field as the primary key, with auto-incrementing value
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
}
