package com.cgb.springboot.dao;

import java.util.List;

import com.cgb.springboot.domain.Users;

/**
 * Created by ${陈广波} on 2020/5/23.
 */
public interface UsersDao {
    List<Users> findAll();

    int insertByUsers(Users User);

    int update(Users User);

    Users findById(Long id);

    Users findByName(String nickname);

    List<Users> findByName2(String nickname);


}
