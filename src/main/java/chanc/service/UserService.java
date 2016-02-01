package chanc.service;

import chanc.domain.User;

import java.util.List;

/**
 * Created by admssa on 01.02.2016.
 */
public interface UserService {
    public User addUser(User user);
    public void editUser(User user);
    public void deleteUser(User user);
    User findUser(int userId);
    User findUserByName(String username);
    List<User> getAllUsers();
}
