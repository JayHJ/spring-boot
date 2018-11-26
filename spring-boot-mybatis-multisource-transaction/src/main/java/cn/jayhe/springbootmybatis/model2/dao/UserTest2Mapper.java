package cn.jayhe.springbootmybatis.model2.dao;

import cn.jayhe.springbootmybatis.model2.entities.UserTest2;
import cn.jayhe.springbootmybatis.model2.entities.UserTest2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTest2Mapper {
    long countByExample(UserTest2Example example);

    int deleteByExample(UserTest2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTest2 record);

    int insertSelective(UserTest2 record);

    List<UserTest2> selectByExample(UserTest2Example example);

    UserTest2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTest2 record, @Param("example") UserTest2Example example);

    int updateByExample(@Param("record") UserTest2 record, @Param("example") UserTest2Example example);

    int updateByPrimaryKeySelective(UserTest2 record);

    int updateByPrimaryKey(UserTest2 record);
}