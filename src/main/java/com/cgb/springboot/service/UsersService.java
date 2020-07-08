package com.cgb.springboot.service;

import java.util.List;
import com.cgb.springboot.domain.Users;

/**
 * Created by ${陈广波} on 2020/5/23.
 */
public interface UsersService {
    List<Users> findAll();

    int insertByUser(Users User);

    int update(Users User);

    Users findById(Long id);

    Users findByName(String nickname);

    List<Users> findByName2(String nickname);
}
