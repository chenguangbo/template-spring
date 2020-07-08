package com.cgb.springboot.service;

import java.util.List;
import com.cgb.springboot.domain.User;

public interface UserService {

    List<User> findAll();

    User insertByUser(User User);

    int update(User User);

    User delete(Long id);

    User findById(Long id);

    boolean exists(User User);

    User findByName(String name);


}
