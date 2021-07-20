package jxlb.wxlitte.demo.ExceptionHander;

import jxlb.wxlitte.demo.utils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author whongwei
 * @Date 2021/7/20
 */
@ControllerAdvice
public class MainException {

    @ExceptionHandler(Exception.class)
    public R error(Exception e){

        e.printStackTrace();
        return R.error().message("执行了全局异常处理..");

    }


 }
