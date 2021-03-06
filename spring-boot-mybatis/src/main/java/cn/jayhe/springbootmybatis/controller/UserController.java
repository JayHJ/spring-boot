package cn.jayhe.springbootmybatis.controller;

import cn.jayhe.springbootmybatis.model.dao.UserMapper;
import cn.jayhe.springbootmybatis.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Jay
 * @Date 11/23/2018 2:55 PM
 * @Version 1.0
 * @Copyright: 2018 www.cdwtrj.com Inc. All rights reserved.
 **/
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public User getUserById() {
        System.out.println("here" + userMapper.countAll());

        List<User> users = userMapper.getAll();

        return userMapper.selectByPrimaryKey(1);
    }


}
