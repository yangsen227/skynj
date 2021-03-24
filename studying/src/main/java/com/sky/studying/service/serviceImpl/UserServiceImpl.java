package com.sky.studying.service.serviceImpl;

import com.sky.studying.dao.UserMapper;
import com.sky.studying.pojo.User;
import com.sky.studying.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CAOYONG
 * @version 1.0
 * @create 2021/3/23 14:38
 * @describe HNU PROJECT
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired(required=false)
    private UserMapper userMapper;
    //登录
    @Override
    public Map<String,Object> userLogin(String uName, String uPwd) {
        Map<String,Object> map = new HashMap<>();
        User user = userMapper.userLogin(uName, uPwd);

        if (user!=null){
            //用户已注册
            final String md5Pwd = getMD5Pwd(uPwd, user.getSalt());
            if (user.getUName().equals(uName)&&user.getUPwd().equals(md5Pwd)){
                //成功
                //登录成功
                //System.out.println("1");
                map.put("userInfo",user);
                map.put("msg","1");
            }else {
                //账号或密码错误
                map.put("msg","0");
                }
        }else {
            //用户未注册
            map.put("msg","2");
        }
        return map;
    }
    //md5加密
    private String getMD5Pwd(String pwd,String salt){
        String md5pwd=pwd+salt;
        String md5 = DigestUtils.md5DigestAsHex(md5pwd.getBytes());
        return md5;
    }

}
