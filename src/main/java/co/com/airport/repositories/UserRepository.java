package co.com.airport.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import co.com.airport.entities.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    
}
