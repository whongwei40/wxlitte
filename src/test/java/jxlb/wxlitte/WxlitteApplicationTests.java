package jxlb.wxlitte;

import jxlb.wxlitte.demo.WxlitteApplication;
import jxlb.wxlitte.demo.entity.ChatList;
import jxlb.wxlitte.demo.entity.ChatLog;
import jxlb.wxlitte.demo.entity.Products;
import jxlb.wxlitte.demo.entity.UserInfo;
import jxlb.wxlitte.demo.service.ChatListService;
import jxlb.wxlitte.demo.service.ChatLogService;
import jxlb.wxlitte.demo.service.ProductsService;
import jxlb.wxlitte.demo.service.UserInfoService;
import jxlb.wxlitte.demo.utils.FormDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@SpringBootTest(classes = WxlitteApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration
class WxlitteApplicationTests {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    ProductsService productsService;

    @Autowired
    private ChatListService chatListService;

    @Autowired
    private ChatLogService chatLogService;

    @Test
    void contextLoads()  {

        String formdate = FormDate.Formdate ( new Date () );
        System.out.println (formdate);

    }

    @Test
    void Datetest(){
        UserInfo userInfo = new UserInfo ();
        userInfo.setOpenId ( "ovAi_5YQJw5vfJ3looMh1OMhL_-g" );

        userInfo.setNickName ( "顾余生" );

        boolean b = userInfoService.saveOrUpdate ( userInfo );
        System.out.println (b);

    }
    @Test
    void ChatLogTest(){

        ChatList chatList =new ChatList ();
        chatList.setTalkAvatar ( "https://thirdwx.qlogo.cn/mmopen/vi_32/O135nI58PmicgiaMG76icBjEyibecCmgDVn4URHK6yGOdic2dn3CaEw6ibKsibSbMWrmbx4mtwfhJeLFQuYVTVCXiandfg/132" );
        chatList.setTalkName ( "甜崽小欣" );
        chatList.setUserId ( "ovAi_5YQJw5vfJ3looMh1OMhL_-g" );

        chatListService.saveOrUpdate ( chatList );

    }

    @Test
    void ChatTest(){

        ChatLog chatLog =new ChatLog ();
        chatLog.setFriendId ( "ovAi_5Y0StidCY3SyKaYU0jkNaUc" );
        chatLog.setTalkContent ( "你吼那么大声干什么嘛" );
        chatLog.setUserId ( "ovAi_5YQJw5vfJ3looMh1OMhL_-g" );


        boolean save = chatLogService.save ( chatLog );
        System.out.println (save);

    }

}
