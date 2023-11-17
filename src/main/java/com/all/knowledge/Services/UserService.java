package com.all.knowledge.Services;

import com.all.knowledge.Entity.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();

    User findUserById(Integer id);

    User saveUser(User user);

    // createUser
    void createUser(User user);

    void deleteUserById(Integer id);
}
