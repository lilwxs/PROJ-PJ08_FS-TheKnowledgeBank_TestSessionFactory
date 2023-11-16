package com.all.knowledge.Services;

import com.all.knowledge.DAO.UserDAO;
import com.all.knowledge.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public List<User> findAllUser() {
        return userDAO.findAllUser();
    }

    public void createUser(User user) {
        userDAO.createUser(user);
    }

}
