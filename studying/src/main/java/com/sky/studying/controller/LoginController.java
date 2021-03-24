package com.sky.studying.controller;

import com.sky.studying.pojo.User;
import com.sky.studying.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author CAOYONG
 * @version 1.0
 * @create 2021/3/23 14:26
 * @describe HNU PROJECT
 */
@Controller
@CrossOrigin(origins = "http://localhost:8082")
public class LoginController {
    @Autowired(required=false)
    private UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public String userLogin(
           @RequestParam("uname") String uName,
            @RequestParam("upwd") String uPwd,
            HttpServletRequest req){
        Map<String, Object> map = userService.userLogin(uName, uPwd);
        String str=(String) map.get("msg");
        /**
         * 0:登录失败
         * 1：登录成功
         * 2：用户未注册
         */
        //获取当前用户信息
        if (str=="1"){
            User info=(User)map.get("userInfo");
            HttpSession session = req.getSession();
            session.setAttribute("uid",info.getUId());
            System.out.println("success");
        }

        return str;
    }

}
