package jxlb.wxlitte.demo.controller;


import cn.hutool.http.HtmlUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jxlb.wxlitte.demo.entity.Products;
import jxlb.wxlitte.demo.entity.Vo.FileID;
import jxlb.wxlitte.demo.entity.Vo.Openid;
import jxlb.wxlitte.demo.entity.Vo.ProductsVo;
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
    public  R save(@RequestBody ProductsVo productsVo){
        /**
         * 小程序前端默认传json字符串
         *前端传过来的是{"products":{"pname":"111","price":"111","pdesc":"111"}}
         * 所以要加一个vo，把products里面的数据取出来传到实体类里面去
         */
        Products products;

        products  =  productsVo.getProducts ();
        String openid =productsVo.getOpenid ();
        String fileID =productsVo.getFileID ();


        products.setFlag ( "0" );//设置为默认上架状态
        products.setMasterId ( openid );
        products.setImage ( fileID );
        boolean save = productsService.save ( products );
        if (save){
            return R.ok ();
        }else {
            return R.error ().message ( "错误" );
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

    @PostMapping("search")
    public R search(@RequestBody String query){
        System.out.println (query);

        JSONObject obj = JSONUtil.parseObj ( query );
        String s = obj.get ( "query", String.class );



        QueryWrapper wrapper =new QueryWrapper (  );
        wrapper.like ( "pname",s );
        wrapper.or (  );
        wrapper.like ( "pdesc",s );
        List  list = productsService.listObjs ( wrapper );
        if (null!=list) {
            return R.ok ().data ( "list", list );
        }else {
            return R.error ().message ( "暂无结果，请换一下关键词" );
        }
    }

    @PostMapping("SearchForID")
    public R SearchForId(@RequestBody String ID){

        System.out.println (ID);

        JSONObject obj = JSONUtil.parseObj ( ID );
        String s = obj.get ( "openid", String.class );



        QueryWrapper wrapper =new QueryWrapper (  );
        wrapper.eq ( "master_id",s );

        List  list = productsService.listObjs ( wrapper );
        if (null!=list) {
            return R.ok ().data ( "list", list );
        }else {
            return R.error ().message ( "暂无结果，请换一下关键词" );
        }


    }
}



