package savannahairlines.local.security.system.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import savannahairlines.local.security.system.controller.dto.UserDTO;
import savannahairlines.local.security.system.model.User;
import savannahairlines.local.security.system.service.UserService;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody UserDTO userDTO){
        return userService.createUser(userDTO.getFirstName(), userDTO.getLastName(), userDTO.getPassword(), userDTO.getEmail(), userDTO.getCharge());
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @GetMapping("/user")
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }

}
