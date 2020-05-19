package com.ray.springboot.serviceImpl;

import com.ray.springboot.entity.User;
import com.ray.springboot.mapper.UserMapper;
import com.ray.springboot.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    //将DAO注入Service层
    @Resource
    private UserMapper userMapper;

    @Override
    public User loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }
}