package jxlb.wxlitte.demo.entity.Vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @Author whongwei
 * @Date 2021/7/22
 */
@Data
public class ChatListVO {

    private String clistId;

    private String talkAvatar;

    private String talkName;

    private String userId;

    private String createTime;

    private String friendId;

    private String lastContent;
}
