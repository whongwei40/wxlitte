package jxlb.wxlitte.demo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author whongwei
 * @Date 2021/7/18
 */
public class FormDate {

    public static  String  Formdate(Date date){
        String strDateFormat = "yyyy-MM-dd HH:mm";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

        String format = sdf.format ( date );


        return format;
    }
}
