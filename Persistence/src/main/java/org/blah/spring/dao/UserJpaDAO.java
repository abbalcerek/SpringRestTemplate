package org.blah.spring.dao;

import org.blah.spring.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by adam on 13.11.16.
 */
@Repository
public class UserJpaDAO implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public User save(User user) {
        entityManager.persist(user);
        return user;
    }
}
