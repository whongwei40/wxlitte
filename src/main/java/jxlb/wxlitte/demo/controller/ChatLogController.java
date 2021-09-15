package jxlb.wxlitte.demo.controller;


import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jxlb.wxlitte.demo.entity.ChatLog;
import jxlb.wxlitte.demo.entity.Vo.ChatLogVo;
import jxlb.wxlitte.demo.entity.Vo.TalkVo;
import jxlb.wxlitte.demo.service.ChatLogService;
import jxlb.wxlitte.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2021-07-22
 */
@RestController
@RequestMapping("/chatLog")
public class ChatLogController {

    @Autowired
    public ChatLogService chatLogService;

    @GetMapping("lastChat")
    public R lastChat(@RequestBody TalkVo talkVo){

        System.out.println (talkVo);

        JSONObject jsonObject = JSONUtil.parseObj ( talkVo );
        String userId = jsonObject.get ( "userId", String.class );
        String friendId = jsonObject.get ( "friendId", String.class );

        String content =chatLogService.getlast(userId,friendId);

        return R.ok ().data ( "content",content );

    }

    @PostMapping("getChatLog")
    public  R getChatLog(@RequestBody TalkVo talkVo){



        List list =chatLogService.getChatLog(talkVo.getUserId (),talkVo.getFriendId ());


        System.out.println (list);
        System.out.println (list.size ());


            return R.ok ().data ( "list",list );
    }

    @PostMapping("addChatLog")
    public R addChatLog(@RequestBody ChatLog chatLog) throws Exception {

        System.out.println (chatLog);

        boolean save = chatLogService.save ( chatLog );

        if (save){
            return R.ok ();
        }else {
            throw new Exception ( "发送消息失败" );
        }


    }
}

