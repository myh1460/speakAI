package comy.mapper;

import comy.dao.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author myh
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2025-07-24 22:13:28
* @Entity comy.dao.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




