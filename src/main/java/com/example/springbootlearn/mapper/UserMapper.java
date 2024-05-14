package com.example.springbootlearn.mapper;


import com.example.springbootlearn.domain.entity.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper //!!!!!这是一个MyBatis的注解，用于标识这是一个Mapper接口
public interface UserMapper {

    // 查询所有用户
    @Select("SELECT * FROM user")
    List<User> getAllUsers();
}
