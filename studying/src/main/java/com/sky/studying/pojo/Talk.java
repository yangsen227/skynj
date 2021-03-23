package com.sky.studying.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author CAOYONG
 * @version 1.0
 * @create 2021/3/23 13:51
 * @describe HNU PROJECT
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Talk {
    private Integer uId;
    private Integer lId;
    private String suggest;
}
