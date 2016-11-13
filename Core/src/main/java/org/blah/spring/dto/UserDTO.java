package org.blah.spring.dto;

import org.blah.spring.entity.User;

/**
 * Created by adam on 13.11.16.
 */
public class UserDTO {

    //member variables
    private Long userId;

    private String userName;

    //constructors
    public UserDTO() {
    }

    public UserDTO(Long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.userName = user.getUserName();
    }

    //getters and setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
