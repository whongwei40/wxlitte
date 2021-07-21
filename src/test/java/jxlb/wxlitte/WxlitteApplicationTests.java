package jxlb.wxlitte;

import jxlb.wxlitte.demo.WxlitteApplication;
import jxlb.wxlitte.demo.entity.Products;
import jxlb.wxlitte.demo.entity.UserInfo;
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


    @Test
    void contextLoads() throws FileNotFoundException {



    }

    @Test
    void Datetest(){
        UserInfo userInfo = new UserInfo ();
        userInfo.setOpenId ( "ovAi_5YQJw5vfJ3looMh1OMhL_-g" );

        userInfo.setNickName ( "顾余生" );

        boolean b = userInfoService.saveOrUpdate ( userInfo );
        System.out.println (b);

    }

}
