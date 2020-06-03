package cn.bdqn.demo99.service.impl;

import cn.bdqn.demo99.entity.Address;
import cn.bdqn.demo99.mapper.AddressMapper;
import cn.bdqn.demo99.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
