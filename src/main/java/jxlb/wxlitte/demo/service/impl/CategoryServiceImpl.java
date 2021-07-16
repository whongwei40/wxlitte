package jxlb.wxlitte.demo.service.impl;

import jxlb.wxlitte.demo.entity.Category;
import jxlb.wxlitte.demo.mapper.CategoryMapper;
import jxlb.wxlitte.demo.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author testjava
 * @since 2021-07-14
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
