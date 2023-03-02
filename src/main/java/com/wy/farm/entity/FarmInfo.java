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
 * 农场基本信息表
 * </p>
 *
 * @author wanyanhw
 * @since 2023-03-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("farm_info")
public class FarmInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 编号
     */
    @TableField("number")
    private String number;

    /**
     * 名称
     */
    @TableField("name")
    private String name;

    /**
     * 头像图片ID
     */
    @TableField("head_pic")
    private Integer headPic;

    /**
     * 背景图片ID
     */
    @TableField("bg_pic")
    private Integer bgPic;

    /**
     * 拥有人
     */
    @TableField("owner")
    private String owner;

    /**
     * 占地面积
     */
    @TableField("area")
    private Double area;

    /**
     * 简介
     */
    @TableField("information")
    private String information;

    /**
     * 开放状态（0-关闭，1-开放）
     */
    @TableField("open")
    private Boolean open;

    /**
     * 备注信息
     */
    @TableField("remark")
    private String remark;

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
