package com.wy.farm.dao.impl;

import com.wy.farm.entity.FarmInfo;
import com.wy.farm.mapper.FarmInfoMapper;
import com.wy.farm.dao.FarmInfoDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 农场基本信息表 服务实现类
 * </p>
 *
 * @author wanyanhw
 * @since 2023-03-02
 */
@Service
public class FarmInfoDaoImpl extends ServiceImpl<FarmInfoMapper, FarmInfo> implements FarmInfoDao {

}
