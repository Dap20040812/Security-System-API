package savannahairlines.local.security.system.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import savannahairlines.local.security.system.controller.dto.AddPermissionDTO;
import savannahairlines.local.security.system.controller.dto.UserDTO;
import savannahairlines.local.security.system.model.User;
import savannahairlines.local.security.system.service.UserService;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {

    private UserService userService;
    @CrossOrigin("*")
    @PostMapping("/user")
    public User createUser(@RequestBody UserDTO userDTO){
        return userService.createUser(userDTO.getFirstName(), userDTO.getLastName(), userDTO.getPassword(), userDTO.getEmail(), userDTO.getCharge());
    }
    @CrossOrigin("*")
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    @CrossOrigin("*")
    @GetMapping("/user")
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @CrossOrigin("*")
    @PutMapping("/user/permission")
    public boolean addPermission(@RequestBody AddPermissionDTO addPermissionDTO){
        return userService.addPermission(addPermissionDTO.getId(), addPermissionDTO.getPermissionId());
    }
    @CrossOrigin("*")
    @DeleteMapping("/user/permission")
    public boolean removePermission(@RequestBody AddPermissionDTO addPermissionDTO){
        return userService.removePermission(addPermissionDTO.getId(), addPermissionDTO.getPermissionId());
    }
    @CrossOrigin("*")
    @GetMapping("/user/login")
    public User getUserByEmailAndPassword(@RequestParam String email, @RequestParam String password){
        return userService.getUserByEmailAndPassword(email, password);
    }



}
