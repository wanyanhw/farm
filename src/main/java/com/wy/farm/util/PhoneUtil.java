package com.wy.farm.util;

import java.util.regex.Pattern;

/**
 * @author wanyanhw
 * @date 2023/3/7 17:20
 */
public class PhoneUtil {

	private final static String PHONE_REG = "^1[0-9]{10}$";

	/**
	 * 校验手机号码格式
	 * @param phone 手机号码
	 * @return 校验结果，true-成功，false-失败
	 */
	public static boolean legalPhoneNumber(String phone) {
		return Pattern.matches(PHONE_REG, phone);
	}
}
