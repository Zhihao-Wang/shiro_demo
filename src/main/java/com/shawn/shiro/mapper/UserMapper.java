package com.shawn.shiro.mapper;

import com.shawn.shiro.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findByUsername(@Param("username")String username);
}

