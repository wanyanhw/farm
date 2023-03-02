package com.wy.farm.dao.impl;

import com.wy.farm.entity.Content;
import com.wy.farm.mapper.ContentMapper;
import com.wy.farm.dao.ContentDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 素材信息表 服务实现类
 * </p>
 *
 * @author wanyanhw
 * @since 2023-03-02
 */
@Service
public class ContentDaoImpl extends ServiceImpl<ContentMapper, Content> implements ContentDao {

}
