package jxlb.wxlitte.demo.mapper;

import jxlb.wxlitte.demo.entity.ChatLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author testjava
 * @since 2021-07-22
 */
public interface ChatLogMapper extends BaseMapper<ChatLog> {

    String getlast(String UserId,String FriendId);
}
