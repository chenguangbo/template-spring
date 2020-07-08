package com.cgb.springboot.controller;

import java.util.List;
import com.cgb.springboot.domain.Users;
import com.cgb.springboot.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ${陈广波} on 2020/5/23.
 */
@RestController
@RequestMapping(value = "/users")
public class UsersController {

    Logger logger = LoggerFactory.getLogger(UsersController.class);
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/findAll")
    public List<Users> findAll() {
        logger.debug("findAll param={}");
        return usersService.findAll();
    }

    @RequestMapping(value = "/insertByUser")
    public int insertByUser(Users users) {
        logger.debug("insertByUser param={}", users);
        System.out.println(users);
        return usersService.insertByUser(users);
    }

    @RequestMapping(value = "/update")
    public int update(Users users) {
        logger.debug("update param={}", users);
        return usersService.update(users);
    }

    @RequestMapping("/findById")
    public Users findById(Long id) {
        logger.debug("findById param={}", id);
        return usersService.findById(id);
    }

    @RequestMapping("findByName")
    public Users findByName(String nickname){
        logger.debug("findByName param={}",nickname);
        return usersService.findByName(nickname);
    }

    @RequestMapping("findByName2")
    public List<Users> findByName2(String nickname){
        logger.info("findByName2 param={}",nickname);
        return usersService.findByName2(nickname);
    }

/*
    List<Users> findAll();

    Users insertByUser(Users User);

    int update(Users User);

    Users findById(Long id);

    Users findByName(String name);
 */


}
