package savannahairlines.local.security.system.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import savannahairlines.local.security.system.model.User;
import savannahairlines.local.security.system.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User createUser(String firstName, String lastName, String password, String email, String charge){

        User user = User.builder()
                .lastName(lastName)
                .firstName(firstName)
                .email(email)
                .password(password)
                .charge(charge)
                .permissions(new ArrayList<>())
                .build();

        return userRepository.save(user);
    }

    public User getUserById(int id){
        return userRepository.findById(id).orElseThrow();
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}