package com.dy.userservice.mapper;

import com.dy.userservice.entity.Users;
import org.apache.ibatis.annotations.Mapper;

/**
* @author dy302
* @description 针对表【users】的数据库操作Mapper
* @createDate 2025-06-13 10:38:12
* @Entity src/main/java/com/dy/userservice/com.Users
*/
@Mapper
public interface UsersMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

}
