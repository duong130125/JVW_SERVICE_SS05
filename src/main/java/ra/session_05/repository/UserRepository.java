package ra.session_05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.session_05.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}