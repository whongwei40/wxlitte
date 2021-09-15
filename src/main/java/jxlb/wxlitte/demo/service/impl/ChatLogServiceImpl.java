package jxlb.wxlitte.demo.service.impl;

import cn.hutool.core.bean.BeanUtil;
import jxlb.wxlitte.demo.entity.ChatLog;
import jxlb.wxlitte.demo.entity.UserInfo;
import jxlb.wxlitte.demo.entity.Vo.ChatLogVo;
import jxlb.wxlitte.demo.mapper.ChatLogMapper;
import jxlb.wxlitte.demo.mapper.UserInfoMapper;
import jxlb.wxlitte.demo.service.ChatLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jxlb.wxlitte.demo.service.UserInfoService;
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
public class ChatLogServiceImpl extends ServiceImpl<ChatLogMapper, ChatLog> implements ChatLogService {


    @Autowired
    UserInfoService userInfoService;

    @Override
    public String getlast(String UserId,String FriendId) {

        String getlast = baseMapper.getlast (UserId,FriendId);

        return getlast;
    }

    @Override
    public List getChatLog(String userId, String friendId) {

        System.out.println (userId+friendId);

        List<ChatLogVo> chatLogVoList =new ArrayList<> (  );

        //根据两边的ID获取互相的聊天记录，封装返回
        List<ChatLog> chatLogList =baseMapper.getChatLogList(userId,friendId);

        //根据ID获取双方的头像，封装返回
        for (ChatLog c:chatLogList
             ) {
            ChatLogVo chatLogVo = new ChatLogVo ();
            UserInfo info = userInfoService.getById ( c.getUserId () );
            String avatarUrl = info.getAvatarUrl ();
            chatLogVo.setAvatarUrl ( avatarUrl );
            BeanUtil.copyProperties ( c,chatLogVo );


            chatLogVoList.add ( chatLogVo );
        }


        return chatLogVoList;
    }
}
