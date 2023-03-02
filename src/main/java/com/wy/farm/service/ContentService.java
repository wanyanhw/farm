package com.wy.farm.service;

import com.wy.farm.entity.ro.ContentVo;

import java.io.InputStream;

/**
 * 素材文件功能接口
 * @author wanyanhw
 * @since 2023/3/2 20:36
 */
public interface ContentService {
    /**
     * 文件上传接口
     * @param inputStream 输入流
     * @return 文件基本信息
     */
    ContentVo upload(InputStream inputStream);

    void delete();
}
