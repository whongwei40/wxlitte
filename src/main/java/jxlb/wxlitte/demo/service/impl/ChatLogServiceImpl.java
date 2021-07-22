package jxlb.wxlitte.demo.service.impl;

import jxlb.wxlitte.demo.entity.ChatLog;
import jxlb.wxlitte.demo.mapper.ChatLogMapper;
import jxlb.wxlitte.demo.service.ChatLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author testjava
 * @since 2021-07-22
 */
@Service
public class ChatLogServiceImpl extends ServiceImpl<ChatLogMapper, ChatLog> implements ChatLogService {



    @Override
    public String getlast(String UserId,String FriendId) {

        String getlast = baseMapper.getlast (UserId,FriendId);

        return getlast;
    }
}
