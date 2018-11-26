package cn.jayhe.springbootmybatis.service.impl;

import cn.jayhe.springbootmybatis.model.dao.UserMapper;
import cn.jayhe.springbootmybatis.model.entities.User;
import cn.jayhe.springbootmybatis.model2.dao.UserTest2Mapper;
import cn.jayhe.springbootmybatis.model2.entities.UserTest2;
import cn.jayhe.springbootmybatis.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class DataSourceServiceImpl implements DataSourceService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserTest2Mapper userMapper1;

    @Override
    @Transactional(value = "transactionManager")
    public void saveRecords() {
        User user1 = new User();
        user1.setName("test1");
        userMapper.insert(user1);

        UserTest2 user2 = new UserTest2();

        user2.setName("test3");
        userMapper1.insert(user2);
    }
}
