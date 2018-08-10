package app.dao;

import app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void save(User user) {
        String sql = "insert into my_user(account,passwd) values(?,?)";
        jdbcTemplate.update(sql, user.getAccount(), user.getPasswd());
    }
}
