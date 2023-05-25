package spring_web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_web.dao.UserDAO;
import spring_web.models.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public List<User> listUsers() {
        return userDAO.listUsers();
    }

    @Override
    public void deleteById(long id) {
        userDAO.deleteById(id);
    }

    @Override
    public User findById(long id) {
        return userDAO.findById(id);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }
}
