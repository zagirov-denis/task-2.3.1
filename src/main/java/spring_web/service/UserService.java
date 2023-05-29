package spring_web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_web.dao.UserDAO;
import spring_web.models.User;

import java.util.List;


public interface UserService {

    void add(User user);

    List<User> listUsers();

    void deleteById(long id);

    User findById(long id);

    void update(User user);
}
