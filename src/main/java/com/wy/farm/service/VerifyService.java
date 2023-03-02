package com.wy.farm.service;

/**
 * @author wanyanhw
 * @date 2023/3/2 20:47
 */
public interface VerifyService {

    void sendPhoneCode(String phone);

    void checkPhoneCode(String phone, String code);
}
