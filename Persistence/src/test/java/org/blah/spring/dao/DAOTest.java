package org.blah.spring.dao;

import org.blah.spring.conf.PersistenceConfig;
import org.blah.spring.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by adam on 13.11.16.
 */
@Transactional
@Rollback
@ContextConfiguration(classes = PersistenceConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DAOTest {

    @Inject
    private UserJpaDAO userDAO;

    @Test
    public void test() {
        User user = new User();
        user.setUserName("spejson");
        userDAO.save(user);
        User userFromDb = userDAO.getUserById(user.getUserId());
        Assert.assertEquals(user, userFromDb);
        System.out.println(user);
    }
}
