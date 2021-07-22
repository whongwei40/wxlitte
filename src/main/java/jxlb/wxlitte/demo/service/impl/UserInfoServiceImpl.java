package jxlb.wxlitte.demo.service.impl;

import jxlb.wxlitte.demo.entity.UserInfo;
import jxlb.wxlitte.demo.mapper.UserInfoMapper;
import jxlb.wxlitte.demo.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author testjava
 * @since 2021-07-20
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
