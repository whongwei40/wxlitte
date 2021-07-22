package jxlb.wxlitte.demo.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jxlb.wxlitte.demo.entity.ChatList;
import jxlb.wxlitte.demo.entity.Vo.ChatListVO;
import jxlb.wxlitte.demo.mapper.ChatListMapper;
import jxlb.wxlitte.demo.service.ChatListService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jxlb.wxlitte.demo.service.ChatLogService;
import jxlb.wxlitte.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author testjava
 * @since 2021-07-22
 */
@Service
public class ChatListServiceImpl extends ServiceImpl<ChatListMapper, ChatList> implements ChatListService {

    @Autowired
    ChatLogService chatLogService;

    @Override
    public List findAll() {

        List endList =new ArrayList (  );

        QueryWrapper wrapper = new QueryWrapper (  );
        wrapper.orderByDesc ( "create_time" );
        List<ChatList> list = baseMapper.selectList ( wrapper );

        for (ChatList c:list
             ) {
            String friendId = c.getFriendId ();
            String userId = c.getUserId ();

            String lastContent = chatLogService.getlast ( userId,friendId );

            ChatListVO chatListVO =new ChatListVO ();

            chatListVO.setLastContent ( lastContent );
            BeanUtil.copyProperties ( c,chatListVO );

            endList.add ( chatListVO );
        }


        return endList;
    }
}
