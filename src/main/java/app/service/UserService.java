package app.service;

import app.entity.User;

public interface UserService {
    void save(User user);

    User getUser(Integer id);

    Iterable<User> getAll();
}
