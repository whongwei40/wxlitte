package jxlb.wxlitte.demo.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author testjava
 * @since 2021-07-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Products implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "pid", type = IdType.ID_WORKER_STR)
    private Integer pid;

    private String pname;

    private String image;

    private Double price;

    @TableLogic//逻辑删除  1删除   0未删除
    private String flag;

    private Integer categoryId;

    private String masterId;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
