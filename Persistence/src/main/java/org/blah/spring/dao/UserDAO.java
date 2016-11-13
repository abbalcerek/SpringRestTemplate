package org.blah.spring.dao;

import org.blah.spring.entity.User;

/**
 * Created by adam on 13.11.16.
 */
public interface UserDAO {

    User getUserById(Long id);

    User save(User user);
}
