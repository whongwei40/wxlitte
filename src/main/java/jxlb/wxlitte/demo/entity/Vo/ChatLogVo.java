package jxlb.wxlitte.demo.entity.Vo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import jxlb.wxlitte.demo.entity.UserInfo;
import lombok.Data;

/**
 * @Author whongwei
 * @Date 2021/7/23
 */
@Data
public class ChatLogVo {

    private String userId;

    private String talkContent;

    private String createTime;

    private String friendId;

    private String avatarUrl;


}
