package com.all.knowledge.Services.Implements;

import com.all.knowledge.Entity.User;
import com.all.knowledge.Repository.UserRepo;
import com.all.knowledge.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> findAllUser() {
        return userRepo.findAllUser();
    }

    @Override
    public User findUserById(Integer id) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public void createUser(User user) {
        userRepo.createUser(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepo.deleteUserById(id);
    }
}
