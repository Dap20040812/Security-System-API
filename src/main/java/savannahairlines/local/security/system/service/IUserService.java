package savannahairlines.local.security.system.service;

import savannahairlines.local.security.system.model.User;

import java.util.List;

public interface IUserService {
    User createUser(User user);
    List<User> getAllUsers();
    User getUser(Integer id);
}
