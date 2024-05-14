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

}
