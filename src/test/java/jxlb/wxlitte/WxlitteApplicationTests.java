package jxlb.wxlitte;

import jxlb.wxlitte.demo.entity.Products;
import jxlb.wxlitte.demo.service.ProductsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

@SpringBootTest
class WxlitteApplicationTests {

    @Resource
    private ProductsService productsService;

    @Test
    void contextLoads() throws FileNotFoundException {
        Date date =new Date (  );
        Products products =new Products ();
        products.setFlag ( "1" );
        products.setCreateTime ( date);
        products.setPid ( 4 );
        products.setPname ( "苹果手机" );



    }

}
