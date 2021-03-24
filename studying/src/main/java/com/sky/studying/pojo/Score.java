package com.sky.studying.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author CAOYONG
 * @version 1.0
 * @create 2021/3/23 22:40
 * @describe HNU PROJECT
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    private Integer uId;
    private Integer getScore;
    private Date getTime;
}
