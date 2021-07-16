package jxlb.wxlitte.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "jxlb.wxlitte")
public class WxlitteApplication {

    public static void main(String[] args) {
        SpringApplication.run ( WxlitteApplication.class, args );
    }

}
