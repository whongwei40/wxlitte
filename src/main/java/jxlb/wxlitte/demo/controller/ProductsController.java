package jxlb.wxlitte.demo.controller;


import jxlb.wxlitte.demo.entity.Products;
import jxlb.wxlitte.demo.service.ProductsService;
import jxlb.wxlitte.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2021-07-14
 */
@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private  ProductsService productsService;

    @GetMapping("findAll")
    public  R findAll(){

        List<Products> productsList = productsService.list ( null);

        return R.ok ().data ( "all",productsList );
    }

    @PostMapping("add")
    public  R save(@RequestBody Products products){

        boolean save = productsService.save ( products );
        if (save){
            return R.ok ();
        }else {
            return R.error ();
        }
    }

    @DeleteMapping("{pid}")//逻辑删除商品
    public R delete(@PathVariable(name = "pid") String id){

        boolean b = productsService.removeById ( id );
        if (b){
            return R.ok ();
        }else {
            return R.error ();
        }
    }

    @PostMapping("update")
    public R update(@RequestBody Products products){

        boolean b = productsService.updateById ( products );
        if (b){
            return R.ok ();
        }else {
            return R.error ();
        }
    }
}

