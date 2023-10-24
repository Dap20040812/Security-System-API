package savannahairlines.local.security.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import savannahairlines.local.security.system.model.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}
