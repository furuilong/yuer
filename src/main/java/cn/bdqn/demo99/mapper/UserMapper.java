package cn.bdqn.demo99.mapper;

import cn.bdqn.demo99.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author furuilong
 * @since 2020-05-17
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
