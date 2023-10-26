package savannahairlines.local.security.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import savannahairlines.local.security.system.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
