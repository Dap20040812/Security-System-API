package savannahairlines.local.security.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import savannahairlines.local.security.system.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
}
