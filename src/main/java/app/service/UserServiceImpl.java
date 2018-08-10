package app.service;

import app.dao.UserDao;
import app.dao.UserRepository;
import app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Autowired
    UserRepository repository;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User getUser(Integer id) {
        return repository.getUser(id);
    }

    @Override
    public Iterable<User> getAll() {
        return repository.findAll();
    }
}
