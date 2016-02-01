package chanc.service;

import chanc.dao.UserDAO;
import chanc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admssa on 01.02.2016.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public User addUser(User user) {
        return userDAO.addUser(user);
    }

    @Override
    public void editUser(User user) {
        userDAO.editUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDAO.deleteUser(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User findUser(int userId) {
        return userDAO.findUser(userId);
    }

    @Override
    @Transactional(readOnly = true)
    public User findUserByName(String username) {
        return userDAO.findUserByName(username);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return (List<User>) userDAO.getAllUsers();
    }
}
