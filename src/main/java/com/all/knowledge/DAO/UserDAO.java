package com.all.knowledge.DAO;

import com.all.knowledge.Entity.User;
import com.all.knowledge.Repository.UserRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO implements UserRepo {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> findAllUser() {
        Session session = sessionFactory.getCurrentSession();
        List<User> users = session.createQuery("from User", User.class).getResultList();
        return users;
    }

    @Override
    public void createUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }
}
