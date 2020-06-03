package cn.bdqn.demo99.service.impl;

import cn.bdqn.demo99.entity.User;
import cn.bdqn.demo99.mapper.UserMapper;
import cn.bdqn.demo99.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author furuilong
 * @since 2020-05-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
