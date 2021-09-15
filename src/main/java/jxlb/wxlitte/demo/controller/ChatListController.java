package jxlb.wxlitte.demo.controller;


import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jxlb.wxlitte.demo.entity.ChatList;
import jxlb.wxlitte.demo.entity.Vo.ChatListVO;
import jxlb.wxlitte.demo.service.ChatListService;
import jxlb.wxlitte.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/chatList")
public class ChatListController {

    @Autowired
    ChatListService chatListService;

    @PostMapping("addChat")
    public R addChat(@RequestBody ChatList chatList){



        boolean b = chatListService.saveOrUpdate ( chatList );

        if (b){
            return R.ok ();
        }else {
            return R.error ();
        }

    }

    @PostMapping("findChat")
    public  R findChat(@RequestBody String userId){

        JSONObject jsonObject = JSONUtil.parseObj ( userId );
        String uid = jsonObject.get ( "userId", String.class );


        List list =chatListService.findAll(uid);

        return R.ok ().data ( "list",list );
    }
}

