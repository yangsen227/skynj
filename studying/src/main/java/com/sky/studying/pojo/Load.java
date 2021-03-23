package com.sky.studying.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author CAOYONG
 * @version 1.0
 * @create 2021/3/23 13:49
 * @describe HNU PROJECT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Load {
    private Integer uId;
    private Integer lId;
    private Integer time;//0为未看完，1为看完
}
