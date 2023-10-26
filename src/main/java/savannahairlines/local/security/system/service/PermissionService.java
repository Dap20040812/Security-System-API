package savannahairlines.local.security.system.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import savannahairlines.local.security.system.model.Permission;
import savannahairlines.local.security.system.repository.PermissionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PermissionService {

    private PermissionRepository permissionRepository;

    public Permission createPermission(String type, String name){
        Permission permission = Permission.builder()
                .type(type)
                .name(name)
                .build();
        return permissionRepository.save(permission);
    }

    public Permission getPermissionById(int id){
        return permissionRepository.findById(id).orElseThrow();
    }

    public List<Permission> getAllPermissions(){
        return permissionRepository.findAll();
    }


}
