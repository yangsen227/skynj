package com.sky.studying.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author CAOYONG
 * @version 1.0
 * @create 2021/3/23 13:22
 * @describe HNU PROJECT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer uId;
    private String uName;
    private String email;
    private String uPwd;
    private Integer auth;
    private String salt;
    private Integer uScore;
    private Integer vip;
    private String dept;
    private String message;
    private String picture;
    private Integer uState;
    private String code;


}
