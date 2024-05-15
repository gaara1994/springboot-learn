package com.example.springbootlearn.service;

import com.example.springbootlearn.domain.entity.User;
import com.example.springbootlearn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired // Spring的注解，用于自动注入
    private UserMapper userMapper;

    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }

    public User getUserById(Long id){
        return userMapper.getUserById(id);
    }

    public int deleteUserById(Long id){
        //1.查询是否存在

        //2.执行删除
        return userMapper.deleteUserById(id);
    }

    public int addUser(User user){
        return userMapper.insertUser(user);
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

}
