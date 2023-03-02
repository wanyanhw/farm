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
 * 用户订单表
 * </p>
 *
 * @author wanyanhw
 * @since 2023-03-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user_order")
public class UserOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 订单编号
     */
    @TableField("number")
    private String number;

    /**
     * 商品类型（1-土地租赁，2-种子购买）
     */
    @TableField("item_type")
    private Integer itemType;

    /**
     * 商品ID
     */
    @TableField("item_id")
    private Integer itemId;

    /**
     * 付款额
     */
    @TableField("payment")
    private Double payment;

    /**
     * 支付状态（0-未支付，1-已支付，2-已取消）
     */
    @TableField("status")
    private Integer status;

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
