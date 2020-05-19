package com.ray.springboot.mapper;

import com.ray.springboot.entity.User;

public interface UserMapper {
    User getInfo(String name, String password);
}
