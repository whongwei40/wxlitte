package jxlb.wxlitte.demo.mapper;

import jxlb.wxlitte.demo.entity.Products;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author testjava
 * @since 2021-07-14
 */
public interface ProductsMapper extends BaseMapper<Products> {


    List<Products> findAll();
}
