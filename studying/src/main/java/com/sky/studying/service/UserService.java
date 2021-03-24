package com.sky.studying.service;

import com.sky.studying.pojo.User;
import org.springframework.stereotype.Service;

import javax.jws.Oneway;
import java.util.Map;

/**
 * @author CAOYONG
 * @version 1.0
 * @create 2021/3/23 14:39
 * @describe HNU PROJECT
 */
public interface UserService {
    Map<String,Object> userLogin(String uName, String uPwd);
}
