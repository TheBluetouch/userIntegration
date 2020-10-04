package pl.kacperBogusz.userIntegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kacperBogusz.userIntegration.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUserId(Long userId);
}
