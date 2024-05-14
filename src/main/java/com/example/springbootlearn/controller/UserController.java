package com.example.springbootlearn.controller;

import com.example.springbootlearn.domain.entity.User;
import com.example.springbootlearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") // 添加请求映射前缀
public class UserController {
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @GetMapping("/list") // 处理GET请求到/users/
//    public List<Map<String,Object>> getAllUsers() {
//        String sql="select * from user";
//        List<Map<String,Object>> list_map=jdbcTemplate.queryForList(sql);
//        return list_map;
//    }

    @Autowired
    private UserService userService;

    @GetMapping("/list") // 处理GET请求到/users/
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}") // 处理GET请求到/users/
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/add") // 处理GET请求到/users/
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

}
