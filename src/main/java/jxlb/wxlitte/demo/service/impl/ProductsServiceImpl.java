package jxlb.wxlitte.demo.service.impl;

import jxlb.wxlitte.demo.entity.Products;
import jxlb.wxlitte.demo.mapper.ProductsMapper;
import jxlb.wxlitte.demo.service.ProductsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author testjava
 * @since 2021-07-14
 */
@Service
public class ProductsServiceImpl extends ServiceImpl<ProductsMapper, Products> implements ProductsService {




    @Override
    public List<Products> findAll() {


        List<Products> list =baseMapper.findAll();

        return list;
    }
}
