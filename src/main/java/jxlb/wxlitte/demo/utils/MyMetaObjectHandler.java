package jxlb.wxlitte.demo.utils;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;


import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {




    @Override
    public void insertFill(MetaObject metaObject) {
        //属性名称，不是字段名称,第二个参数不一定必须是date类型
        this.setFieldValByName("createTime", FormDate.Formdate ( new Date (  ) ), metaObject);
        this.setFieldValByName("updateTime",FormDate.Formdate ( new Date (  ) ), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime",FormDate.Formdate ( new Date (  ) ), metaObject);
    }
}
