package spring_web.dao;


import spring_web.models.User;

import java.util.List;

public interface UserDAO {

    void add(User user);

    List<User> listUsers();

    void deleteById(long id);

    User findById(long id);
    void update(User user);

}
