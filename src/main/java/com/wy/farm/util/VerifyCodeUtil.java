package com.wy.farm.util;

import com.wy.farm.common.ResultCode;
import com.wy.farm.common.TipException;
import org.springframework.stereotype.Component;

/**
 * @author wanyanhw
 * @date 2023/3/7 16:42
 */
@Component
public class VerifyCodeUtil {

	/**
	 * 验证码校验
	 * @param phone 手机号
	 * @param code 短信验证码
	 * @return 验证结果，true-成功，false-失败
	 */
	public boolean verifyPhoneAndCode(String phone, String code) {
		// TODO @wanyanhongwei 校验手机短信验证码
		return false;
	}

	/**
	 * 生成短信验证码
	 */
	private static String generateCode() {
		// TODO @wanyanhongwei 生成正确的短信验证码
		return "";
	}

	/**
	 * 发送短信验证码
	 * @param phone 电话号
	 */
	public void sendCode(String phone) throws TipException {
		boolean legalPhoneNumber = PhoneUtil.legalPhoneNumber(phone);
		if (!legalPhoneNumber) {
			throw new TipException(ResultCode.ILLEGAL_PHONE_NUMBER);
		}
		String code = generateCode();
		// TODO @wanyanhongwei 编辑短信验证码内容
		String msg = "" + code;
		doSend(phone, msg);
	}

	/**
	 * 发送短信
	 * @param phone 目标手机号
	 * @param msg 短信内容
	 */
	private void doSend(String phone, String msg) {
		// TODO @wanyanhongwei 短信发送接口对接实现
	}
}
