package jxlb.wxlitte.demo.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author testjava
 * @since 2021-07-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ChatLog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "clog_id", type = IdType.ID_WORKER_STR)
    private String clogId;

    private String userId;

    private String talkContent;

    @TableField(fill = FieldFill.INSERT)
    private String createTime;

    private String friendId;


}
