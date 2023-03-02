package com.wy.farm.entity.ro;

import lombok.Data;

/**
 * @author wanyanhw
 * @date 2023/3/2 20:29
 */
@Data
public class UserInfoRO {
    private Integer userId;
    private String account;
    private String name;
    private String pass;
    private String phone;
    private String gender;
    private String headPic;
    private Integer type;
    private String addr;
}
