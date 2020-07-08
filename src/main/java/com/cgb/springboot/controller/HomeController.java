package com.cgb.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.cgb.springboot.domain.User;
import com.cgb.springboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "home")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);


    @Autowired
    private UserService userService;

    @RequestMapping(value = "findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/post")
    public User post(@RequestParam(value = "content", defaultValue = "content") String content, @RequestParam(value = "nickname", defaultValue = "nickname") String nickname) {
        logger.debug("post param={}",1);
        logger.debug("post param={}", getParam2());
        User user1 = userService.insertByUser(new User(1,content,nickname));
        return user1;
    }


    @RequestMapping("/update")
    public int update(@RequestParam(value = "id") Integer id, @RequestParam(value = "content") String content, @RequestParam(value = "nickname") String nickname) {
        logger.debug("update param={}");
        int user = userService.update(new User(id, nickname, content));
        return user;
    }


    @RequestMapping(value = "/postRestful")
    public String postRestful() {

        return "1213";
    }


    @RequestMapping(value = "/index/{id}")
    public String home(@PathVariable(value = "id") int id) {
        logger.info("home -----");
        System.out.println(id);
        Map<String, Object> result = new HashMap<>();
        result.put("age", 13);
        result.put("name", "陈广波");
        return "1231";
    }

    @RequestMapping
    public Map<String, Object> getParam() {
        Map<String, Object> result = new HashMap<>();
        result.put("age", 13);
        result.put("name", "陈广波");
        return result;
    }

    @RequestMapping(value = "toString")
    public Map<String, Object> getParam2() {
        Map<String, Object> result = new HashMap<>();
        result.put("age", 13);
        result.put("name", "陈广波");
        return result;
    }

    @RequestMapping(value = "/insertByUser/{content}/{nickname}")
    public User insertByUser(@PathVariable(value = "content") String content, @PathVariable(value = "nickname") String nickname) {
        User user = new User();
//        "曾经沧海难为水"
        user.setContent("曾经沧海难为水");
        user.setNickname("除却巴山不是云");
        user.setId(1);
        User user2 = new User(1, nickname, content);
        User user1 = userService.insertByUser(user2);
        return user2;
    }

    @RequestMapping(value = "insertUser")
    public User insertUser(@RequestParam(value = "content") String content, @RequestParam(value = "nickname") String nickname) {
        User user = new User(0, nickname, content);
        User user1 = userService.insertByUser(user);
        return user1;
    }


}
