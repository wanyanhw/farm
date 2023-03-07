package com.wy.farm.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wanyanhw
 * @date 2023/3/7 15:54
 */
@Data
@AllArgsConstructor
public class ResultCode {
    private boolean success;
    private int code;
    private String message;

    // 通用模块
    public static final ResultCode SUCCESS = new ResultCode(true, 10000, "success");
    public static final ResultCode FAIL = new ResultCode(false, 11111, "failure");

    // 工具模块
    public static final ResultCode ERROR_VERIFY_CODE = new ResultCode(false, 1000001, "验证码错误");
    public static final ResultCode ILLEGAL_PHONE_NUMBER = new ResultCode(false, 1000002, "非法手机号");

    // 用户模块
    public static final ResultCode NO_USER = new ResultCode(false, 1001001, "当前用户不存在");
    public static final ResultCode ERROR_LOGIN_TYPE = new ResultCode(false, 1001002, "无效登录类型");
}
