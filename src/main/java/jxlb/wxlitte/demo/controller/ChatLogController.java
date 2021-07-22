package jxlb.wxlitte.demo.controller;


import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jxlb.wxlitte.demo.entity.Vo.TalkVo;
import jxlb.wxlitte.demo.service.ChatLogService;
import jxlb.wxlitte.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
}

