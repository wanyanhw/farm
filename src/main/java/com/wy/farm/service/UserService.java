package com.wy.farm.service;

import com.wy.farm.entity.ro.UserInfoRO;

/**
 * 用户基本功能接口
 * @author wanyanhw
 * @since 2023/3/2 20:22
 */
public interface UserService {

    /**
     * 用户注册接口
     * @param userInfo 基本信息参数
     * @return 用户账号基本信息
     */
    UserInfoRO register(UserInfoRO userInfo);

    /**
     * 用户登录接口
     * @param username 用户账号
     * @param password 用户密码
     */
    void login(String username, String password);

    /**
     * 退出登录接口
     * @param username 用户账号
     */
    void logout(String username);

    /**
     * 用户绑定土地
     * @param userId 用户ID
     * @param landId 土地ID
     */
    void bind(Integer userId, Integer landId);
}
