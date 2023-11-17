package com.all.knowledge.Repository;

import com.all.knowledge.Entity.User;

import java.util.List;

public interface UserRepo {
    List<User> findAllUser();
    void createUser(User user);

    void deleteUserById(Integer id);

}
