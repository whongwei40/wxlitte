package jxlb.wxlitte.demo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class ChatList implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "clist_id", type = IdType.ID_WORKER_STR)
    private String clistId;

    private String talkAvatar;

    private String talkName;

    private String userId;

    @TableField(fill = FieldFill.INSERT)
    private String createTime;

    private String friendId;

}
