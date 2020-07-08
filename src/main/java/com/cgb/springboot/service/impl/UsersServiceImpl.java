package com.cgb.springboot.service.impl;

import java.util.List;
import com.cgb.springboot.dao.UsersDao;
import com.cgb.springboot.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ${陈广波} on 2020/5/23.
 */
@Service
public class UsersServiceImpl implements com.cgb.springboot.service.UsersService {


    @Autowired
    UsersDao usersDao;

    @Override
    public List<Users> findAll() {
        return usersDao.findAll();
    }

    @Override
    public int insertByUser(Users users) {
        return usersDao.insertByUsers(users);
    }

    @Override
    public int update(Users users) {
        return usersDao.update(users);
    }

    @Override
    public Users findById(Long id) {
        return usersDao.findById(id);
    }

    @Override
    public Users findByName(String name) {
        return usersDao.findByName(name);
    }

    @Override
    public List<Users> findByName2(String nickname) {
        return usersDao.findByName2(nickname);
    }
}
