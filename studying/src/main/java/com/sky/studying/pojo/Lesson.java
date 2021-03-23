package com.sky.studying.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author CAOYONG
 * @version 1.0
 * @create 2021/3/23 13:36
 * @describe HNU PROJECT
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lesson {
    private Integer lId;
    private String text;//课程简介
    private String url;
    private String state;//文件格式
    private Integer lScore;
    private Integer uId;
    private Integer success;//0为审核中，1为通过，2为未通过
    private Integer collection;//收藏量
    private Date uploadTime;
    private String classify;//一级分类
    private String classify2;//二级目录
    private String page;
    private String title;
}
