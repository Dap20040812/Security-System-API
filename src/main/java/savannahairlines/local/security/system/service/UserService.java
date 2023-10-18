package savannahairlines.local.security.system.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import savannahairlines.local.security.system.model.User;
import savannahairlines.local.security.system.repository.IUserRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService implements  IUserService{
    private final IUserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public User getUser(Integer id){
        return userRepository.findById(id).get();
    }
}
