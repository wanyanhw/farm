package com.wy.farm.dao.impl;

import com.wy.farm.entity.UserOrder;
import com.wy.farm.mapper.UserOrderMapper;
import com.wy.farm.dao.UserOrderDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户订单表 服务实现类
 * </p>
 *
 * @author wanyanhw
 * @since 2023-03-02
 */
@Service
public class UserOrderDaoImpl extends ServiceImpl<UserOrderMapper, UserOrder> implements UserOrderDao {

}
