package com.wy.farm.em;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author wanyanhw
 * @date 2023/3/7 16:51
 */
@Getter
@AllArgsConstructor
public enum LoginTypeEnum {
	/**
	 * 账号登录
	 */
	ACCOUNT(1),
	/**
	 * 手机号码登录
	 */
	PHONE(2),
	/**
	 * 微信登录
	 */
	WECHAT(3);

	final private Integer code;
}
