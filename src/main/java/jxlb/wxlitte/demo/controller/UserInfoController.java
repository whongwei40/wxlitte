package jxlb.wxlitte.demo.controller;


import cn.hutool.Hutool;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import jxlb.wxlitte.demo.entity.UserInfo;
import jxlb.wxlitte.demo.service.UserInfoService;
import jxlb.wxlitte.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2021-07-20
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    public UserInfoService userInfoService;

    @GetMapping("{id}")
    public R  getByID(@PathVariable String id){

        System.out.println ("openid==========="+id);

        UserInfo info = userInfoService.getById ( id );

        return R.ok ().data ( "info",info );

    }
}

