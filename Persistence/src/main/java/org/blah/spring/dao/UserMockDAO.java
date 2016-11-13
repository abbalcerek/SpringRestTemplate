package org.blah.spring.dao;

import org.blah.spring.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by adam on 13.11.16.
 */
@Repository
public class UserMockDAO implements UserDAO {

    @Override
    public User getUserById(Long id) {
        return new User();
    }

    @Override
    public User save(User user) {
        return user;
    }
}
