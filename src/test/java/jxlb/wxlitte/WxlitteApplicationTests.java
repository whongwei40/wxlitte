package jxlb.wxlitte;

import jxlb.wxlitte.demo.WxlitteApplication;
import jxlb.wxlitte.demo.entity.Products;
import jxlb.wxlitte.demo.service.ProductsService;
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


@SpringBootTest(classes = WxlitteApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration
class WxlitteApplicationTests {

    @Resource
    private ProductsService productsService;

    @Test
    void contextLoads() throws FileNotFoundException {
        Date date =new Date (  );
        Products products =new Products ();
        products.setFlag ( "1" );
        products.setCreateTime ( date);
        products.setPid ( "4" );
        products.setPname ( "苹果手机" );



    }

    @Test
    void Datetest(){

        Date date = FormDate.Formdate ( new Date () );
        System.out.println (date);

    }

}
