package com.sky.studying.controller;

import com.sky.studying.pojo.Score;
import com.sky.studying.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CAOYONG
 * @version 1.0
 * @create 2021/3/23 22:45
 * @describe HNU PROJECT
 */
@Controller
public class ScoreController {
    @Autowired
    private ScoreService scoreService;
    //通过上传资料获取积分
    @RequestMapping("/upLoad")
    public void upLoad(Score score){
        scoreService.upLoad(score);
    }
}
