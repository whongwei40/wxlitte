package jxlb.wxlitte.demo.service;

import jxlb.wxlitte.demo.entity.Products;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author testjava
 * @since 2021-07-14
 */
public interface ProductsService extends IService<Products> {


    List<Products> findAll();
}
