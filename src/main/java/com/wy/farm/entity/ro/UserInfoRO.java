package com.wy.farm.entity.ro;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wanyanhw
 * @date 2023/3/2 20:29
 */
@Data
@ApiModel("用户基本信息")
public class UserInfoRO {

    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("账号名称")
    private String account;

    @ApiModelProperty("真实姓名")
    private String name;

    @ApiModelProperty("账号密码")
    private String pass;

    @ApiModelProperty("手机号码")
    private String phone;

    @ApiModelProperty("手机短信验证码")
    private String verifyCode;

    @ApiModelProperty("性别代码，1-男，2-女")
    private String gender;

    @ApiModelProperty("头像文件地址")
    private String headPic;

    @ApiModelProperty("用户类型，1-农场主，2-客户")
    private Integer type;

    @ApiModelProperty("用户地址")
    private String addr;
}
