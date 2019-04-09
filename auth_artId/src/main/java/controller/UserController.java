package controller;

import model.User;

public class UserController {

    public User getUser() {

        User user = new User();
        user.setUsername("peter");
        user.setPassword("qwerty");
        user.setEmail("petera@gmail.com");
        user.setRole("guest");
        return user;
    }
}
