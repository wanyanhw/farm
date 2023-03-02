package com.wy.farm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 素材信息表
 * </p>
 *
 * @author wanyanhw
 * @since 2023-03-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("content")
public class Content implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 素材名称
     */
    @TableField("name")
    private String name;

    /**
     * 素材类型（1-图片，2-视频）
     */
    @TableField("type")
    private Integer type;

    /**
     * 存储地址
     */
    @TableField("url")
    private String url;

    /**
     * 缩略图地址
     */
    @TableField("thumb_url")
    private String thumbUrl;

    /**
     * 引用模块（1-用户引用，2-农场引用，3-土地引用）
     */
    @TableField("module")
    private Integer module;

    /**
     * 引用模块ID
     */
    @TableField("module_id")
    private Integer moduleId;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 删除标识（0-未删除，1-已删除）
     */
    @TableField("deleted")
    @TableLogic
    private Boolean deleted;


}
