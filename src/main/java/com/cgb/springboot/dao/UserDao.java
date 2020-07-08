package com.cgb.springboot.dao;

import java.util.List;
import com.cgb.springboot.domain.User;

public interface UserDao {

    List<User> findAll();

    int insertByUser(User user);

    int update(User User);

}
