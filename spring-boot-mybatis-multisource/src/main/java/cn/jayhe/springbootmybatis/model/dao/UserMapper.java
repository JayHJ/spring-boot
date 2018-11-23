package cn.jayhe.springbootmybatis.model.dao;

import cn.jayhe.springbootmybatis.model.entities.User;
import cn.jayhe.springbootmybatis.model.entities.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.*;

public interface UserMapper {
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

    /**
     * we can use annotation here too.
     * @return
     */

    @Select("select count(*) from user")
    int countAll();

    @Insert("INSERT INTO user(user_name,password,user_sex) VALUES(#{userName}, #{password}, #{userSex})")
    void insertWithAnnotation(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Long id);

    @Update("UPDATE user SET user_name=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(User user);

    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "userName",  column = "user_name"),
            @Result(property = "password",  column = "password"),
            @Result(property = "userSex",  column = "user_sex"),
            @Result(property = "nickName", column = "nick_name")
    })
    List<User> getAll();

}