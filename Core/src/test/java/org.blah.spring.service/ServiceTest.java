package org.blah.spring.service;

import org.blah.spring.conf.CoreConfig;
import org.blah.spring.dto.UserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import javax.inject.Inject;

/**
 * Created by adam on 13.11.16.
 */
@ContextConfiguration(classes = CoreConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ServiceTest {

    @Inject
    private UserService userService;

    @Test
    public void test() {
        UserDTO user = userService.user();
        System.out.println(user);
        Assert.notNull(user);
    }

}
