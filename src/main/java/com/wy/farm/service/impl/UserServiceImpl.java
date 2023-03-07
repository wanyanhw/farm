package com.wy.farm.service.impl;

import com.wy.farm.entity.ro.UserInfoRO;
import com.wy.farm.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wanyanhw
 * @date 2023/3/7 17:05
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserInfoRO register(UserInfoRO userInfo) {
        // TODO @wanyanhongwei 注册用户账号信息，并返回用户信息
        return null;
    }

    @Override
    public UserInfoRO login(String username, String password) {
        // TODO @wanyanhongwei 账号密码登录，并返回用户信息
        return null;
    }

    @Override
    public UserInfoRO loginByPhone(String phone, String verifyCode) {
        // TODO @wanyanhongwei 手机登录时隐藏新用户注册逻辑
        return null;
    }

    @Override
    public void logout(String username) {
        // TODO @wanyanhongwei 用户注销登录，记录退出时间
    }

    @Override
    public void bind(Integer userId, Integer landId) {
        // TODO @wanyanhongwei 用户绑定土地实现
    }
}
