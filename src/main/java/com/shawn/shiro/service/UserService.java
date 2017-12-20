package com.shawn.shiro.service;

import com.shawn.shiro.model.User;

public interface UserService {

User findByUsername(String username);
}
