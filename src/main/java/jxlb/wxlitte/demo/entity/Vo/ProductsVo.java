package jxlb.wxlitte.demo.entity.Vo;



import jxlb.wxlitte.demo.entity.UserInfo;
import jxlb.wxlitte.demo.entity.Products;
import lombok.Data;

/**
 * @Author whongwei
 * @Date 2021/7/17
 */
@Data
public class ProductsVo {
    private Products products;
    private String openid;
    private String fileID;
    private UserInfo userInfo;
}
