package com.sky.studying.dao;

import com.sky.studying.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //登录
    User userLogin(String uName, String uPwd);
}
