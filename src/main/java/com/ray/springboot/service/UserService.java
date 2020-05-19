package com.ray.springboot.service;

import com.ray.springboot.entity.User;

public interface UserService {
    User loginIn(String name, String password);
}
