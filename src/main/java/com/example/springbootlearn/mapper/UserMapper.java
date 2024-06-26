package com.example.springbootlearn.mapper;


import com.example.springbootlearn.domain.entity.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper //!!!!!这是一个MyBatis的注解，用于标识这是一个Mapper接口
public interface UserMapper {

    // 查询所有用户
    @Select("SELECT * FROM user")
    List<User> getAllUsers();

    // 根据id查询用户
    @Select("SELECT * FROM user WHERE id = #{id}")
    User getUserById(@Param("id") Long id);

    // 根据id删除用户
    @Delete("DELETE FROM user WHERE id = #{id}")
    int deleteUserById(@Param("id") Long id);

    // 插入新用户
    // 使用完整的User对象作为参数
    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    int insertUser(User user);


    // 使用完整的User对象作为参数
    @Insert("UPDATE user SET name = #{name},age = #{age} WHERE id = #{id}")
    int updateUser(User user);
}
