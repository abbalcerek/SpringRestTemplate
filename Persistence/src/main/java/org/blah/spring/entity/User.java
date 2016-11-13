package org.blah.spring.entity;

import javax.persistence.*;

/**
 * Created by adam on 13.11.16.
 */
@Entity
@Table(name = "user")
public class User {

    //member variables
    @Id()
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

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

    //helper methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return userId != null ? userId.equals(user.userId) : user.userId == null;

    }

    @Override
    public int hashCode() {
        return userId != null ? userId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
