package savannahairlines.local.security.system.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import savannahairlines.local.security.system.controller.dto.UserDTO;
import savannahairlines.local.security.system.model.User;
import savannahairlines.local.security.system.service.IUserService;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserController {
    private final IUserService userService;

    @CrossOrigin(origins = "*")
    @GetMapping("/user")
    public ResponseEntity getAllUsers(){
        try{
            return new ResponseEntity(userService.getAllUsers(), HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/user/{id}")
    public ResponseEntity getUser(@PathVariable Integer id){
        try{
            return new ResponseEntity(userService.getUser(id), HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @CrossOrigin("*")
    @PostMapping("/user")
    public ResponseEntity createUser(@RequestBody UserDTO userDTO){
        try{
            User user = new User(userDTO.getFirstName(),userDTO.getLastName(),userDTO.getPassword(),userDTO.getCharge());
            return new ResponseEntity(userService.createUser(user),HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
