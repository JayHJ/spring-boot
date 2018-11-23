package cn.jayhe.springbootmybatis.model2.dao;

import cn.jayhe.springbootmybatis.model2.entities.User;
import cn.jayhe.springbootmybatis.model2.entities.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.*;

public interface User2Mapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "userName",  column = "user_name"),
            @Result(property = "password",  column = "password"),
            @Result(property = "userSex",  column = "user_sex"),
            @Result(property = "nickName", column = "nick_name")
    })
    List<User> getAll();

    @Select("select count(*) from user")
    int countAll();
}