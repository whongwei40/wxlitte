package jxlb.wxlitte.demo.utils;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author whongwei
 * @Date 2021/7/18
 */
public class FormDate {

    public static  String  Formdate(Date date){
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

        String format = sdf.format ( date );


        return format;
    }


    public static  String FormTime(String starDate) throws ParseException {

        String strDateFormat = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat ( strDateFormat );
        Date parse = sdf.parse ( starDate );

        Date date = new Date (  );

        int i = parse.compareTo ( date );

        if (i==0){
            return "今天";
        }else if (i==-1){
            long from = parse.getTime();
            long to = date.getTime();
            int days = (int) ((to - from)/(1000 * 60 * 60 * 24));

            if (days<7){
                return days+"天前";
            }else {
                return starDate.substring ( 5,11 );
            }



        }


        return starDate;
    }
}
