package jxlb.wxlitte.demo.service;

import jxlb.wxlitte.demo.entity.ChatLog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author testjava
 * @since 2021-07-22
 */
public interface ChatLogService extends IService<ChatLog> {


    String getlast(String UserId,String FriendId);

    List getChatLog(String userId, String friendId);
}
