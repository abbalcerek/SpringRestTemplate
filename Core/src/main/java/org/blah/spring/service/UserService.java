package org.blah.spring.service;

import org.blah.spring.dao.UserMockDAO;
import org.blah.spring.dto.UserDTO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by adam on 13.11.16.
 */
@Service
public class UserService {

    @Inject
    private UserMockDAO userDAO;

    public UserDTO user() {
        return new UserDTO(userDAO.getUserById(1L));
    }
}
