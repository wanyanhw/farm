package com.wy.farm.entity;

import java.math.BigDecimal;
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
 * 土地基本信息表
 * </p>
 *
 * @author wanyanhw
 * @since 2023-03-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("land_info")
public class LandInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 农场ID
     */
    @TableField("farm_id")
    private Integer farmId;

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
     * 长度
     */
    @TableField("length")
    private Double length;

    /**
     * 宽度
     */
    @TableField("width")
    private Double width;

    /**
     * 位置
     */
    @TableField("location")
    private String location;

    /**
     * 价格
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 折扣价
     */
    @TableField("discount_price")
    private BigDecimal discountPrice;

    /**
     * 开放状态（0-关闭，1-开放）
     */
    @TableField("open")
    private Boolean open;

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
