package com.wy.farm.controller;

import com.wy.farm.common.ResponseResult;
import com.wy.farm.common.ResultCode;
import com.wy.farm.em.LoginTypeEnum;
import com.wy.farm.entity.ro.UserInfoRO;
import com.wy.farm.service.UserService;
import com.wy.farm.util.VerifyCodeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wanyanhw
 * @date 2023/3/7 16:00
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户接口")
public class UserController {

	@Resource
	private UserService userService;

	@Resource
	private VerifyCodeUtil verifyCodeUtil;

	@ApiOperation("用户注册")
	@PostMapping("/register")
	public ResponseResult<UserInfoRO> register(@ApiParam(required = true, value = "用户基本信息") @RequestBody UserInfoRO userInfo) {
		UserInfoRO returnInfo = userService.register(userInfo);
		return ResponseResult.buildSucc(returnInfo);
	}

	@ApiOperation("用户登录")
	@PostMapping("/login")
	public ResponseResult<UserInfoRO> login(@ApiParam(required = true, value = "登录类型") @RequestParam(name = "type") Integer type,
												@ApiParam(required = true, value = "用户账号基本信息") @RequestBody UserInfoRO userInfo) {
		UserInfoRO returnInfo;
		if (LoginTypeEnum.PHONE.getCode().equals(type)) {
			// 手机验证码登录
			boolean verify = verifyCodeUtil.verifyPhoneAndCode(userInfo.getPhone(), userInfo.getVerifyCode());
			if (!verify) {
				return ResponseResult.buildFail(ResultCode.ERROR_VERIFY_CODE);
			}
			returnInfo = userService.loginByPhone(userInfo.getPhone(), userInfo.getVerifyCode());
		} else if (LoginTypeEnum.ACCOUNT.getCode().equals(type)) {
			// 账号密码登录
			returnInfo = userService.login(userInfo.getAccount(), userInfo.getPass());
		} else {
			return ResponseResult.buildFail(ResultCode.ERROR_LOGIN_TYPE);
		}

		if (returnInfo == null) {
			return ResponseResult.buildFail(ResultCode.NO_USER);
		}
		return ResponseResult.buildSucc(returnInfo);
	}
}
