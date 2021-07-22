package jxlb.wxlitte.demo.controller;


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

    @GetMapping("findChat")
    public  R findChat(){

        List list =chatListService.findAll();

        return R.ok ().data ( "list",list );
    }
}

