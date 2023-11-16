package savannahairlines.local.security.system.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import savannahairlines.local.security.system.model.Permission;
import savannahairlines.local.security.system.repository.AreaRepository;
import savannahairlines.local.security.system.repository.PermissionRepository;
import savannahairlines.local.security.system.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PermissionService {

    private PermissionRepository permissionRepository;
    private UserRepository userRepository;
    private AreaRepository areaRepository;

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

    public boolean verifyPermission(int userId, int AreaId){

        List<Permission> userPermissions = userRepository.findById(userId).orElseThrow().getPermissions();
        List<Permission> areaPermissions = areaRepository.findById(AreaId).orElseThrow().getPermissions();

        for (Permission userPermission : userPermissions) {
            for (Permission areaPermission : areaPermissions) {
                if (userPermission.getId() == areaPermission.getId()) {
                    return true;
                }
            }
        }
        return false;
    }


}
