package savannahairlines.local.security.system.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import savannahairlines.local.security.system.controller.dto.PermissionDTO;
import savannahairlines.local.security.system.model.Permission;
import savannahairlines.local.security.system.service.PermissionService;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class PermissionController {

    private PermissionService permissionService;

    @PostMapping("/permission")
    public Permission createPermission(@RequestBody PermissionDTO permissionDTO){
        return permissionService.createPermission(permissionDTO.getType(), permissionDTO.getName());
    }

    @GetMapping("/permission/{id}")
    public Permission getPermissionById(@PathVariable int id){
        return permissionService.getPermissionById(id);
    }

    @GetMapping("/permission")
    public Iterable<Permission> getAllPermissions(){
        return permissionService.getAllPermissions();
    }
}
