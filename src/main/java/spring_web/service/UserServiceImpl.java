package spring_web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_web.dao.UserDAO;
import spring_web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;
    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> listUsers() {
        return userDAO.listUsers();
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        userDAO.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(long id) {
        return userDAO.findById(id);
    }

    @Override
    @Transactional
    public void update(User user) {
        userDAO.update(user);
    }
}
