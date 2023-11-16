package savannahairlines.local.security.system.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import savannahairlines.local.security.system.controller.dto.PermissionDTO;
import savannahairlines.local.security.system.model.Permission;
import savannahairlines.local.security.system.service.PermissionService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class PermissionController {

    private PermissionService permissionService;
    @CrossOrigin("*")
    @PostMapping("/permission")
    public Permission createPermission(@RequestBody PermissionDTO permissionDTO){
        return permissionService.createPermission(permissionDTO.getType(), permissionDTO.getName());
    }
    @CrossOrigin("*")
    @GetMapping("/permission/{id}")
    public Permission getPermissionById(@PathVariable int id){
        return permissionService.getPermissionById(id);
    }
    @CrossOrigin("*")
    @GetMapping("/permission")
    public List<Permission> getAllPermissions(){
        return permissionService.getAllPermissions();
    }
    @CrossOrigin("*")
    @GetMapping("/permission/verify")
    public boolean verifyPermission(@RequestParam int userId, @RequestParam int areaId){
        return permissionService.verifyPermission(userId, areaId);
    }
}
