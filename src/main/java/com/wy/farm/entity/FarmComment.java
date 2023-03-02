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
 * 农场评价信息表
 * </p>
 *
 * @author wanyanhw
 * @since 2023-03-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("farm_comment")
public class FarmComment implements Serializable {

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
     * 用户ID
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 等级（1-最差，2-较差，3-一般，4-良好，5-非常好）
     */
    @TableField("level")
    private Integer level;

    /**
     * 评论内容
     */
    @TableField("message")
    private String message;

    /**
     * 回复评论消息ID
     */
    @TableField("reply_comment_id")
    private Integer replyCommentId;

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
