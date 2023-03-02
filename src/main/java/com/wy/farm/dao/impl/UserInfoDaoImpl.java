package com.wy.farm.dao.impl;

import com.wy.farm.entity.UserInfo;
import com.wy.farm.mapper.UserInfoMapper;
import com.wy.farm.dao.UserInfoDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息表 服务实现类
 * </p>
 *
 * @author wanyanhw
 * @since 2023-03-02
 */
@Service
public class UserInfoDaoImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoDao {

}
