package com.sky.studying.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author CAOYONG
 * @version 1.0
 * @create 2021/3/23 13:34
 * @describe HNU PROJECT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consume {
    private Integer uId;
    private Integer lId;
    private Integer bought;
}
