package jxlb.wxlitte.demo.service;

import jxlb.wxlitte.demo.entity.ChatList;
import com.baomidou.mybatisplus.extension.service.IService;
import jxlb.wxlitte.demo.entity.Vo.ChatListVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author testjava
 * @since 2021-07-22
 */
public interface ChatListService extends IService<ChatList> {

    List findAll(String uid);
}
