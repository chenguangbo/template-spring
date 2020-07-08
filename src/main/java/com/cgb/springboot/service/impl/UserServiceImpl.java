package com.cgb.springboot.service.impl;

import java.util.List;
import com.cgb.springboot.dao.UserDao;
import com.cgb.springboot.domain.User;
import com.cgb.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User insertByUser(User user) {
        int i = userDao.insertByUser(user);
        System.out.println(i);
        return user;
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public User delete(Long id) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public boolean exists(User User) {
        return false;
    }

    @Override
    public User findByName(String name) {
        return null;
    }
}
