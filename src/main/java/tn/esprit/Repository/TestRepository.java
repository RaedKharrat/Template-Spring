package tn.esprit.Repository;

// Importing necessary libraries
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.Entity.Test;

// Declaring the interface as a Spring Data repository
@Repository
// Extending the CrudRepository interface for basic CRUD operations
public interface TestRepository extends CrudRepository<Test, Long> {
}
