package com.dy.permissionservice.mapper;


import com.dy.permissionservice.entity.UserRoles;
import org.apache.ibatis.annotations.Mapper;

/**
* @author dy302
* @description 针对表【user_roles】的数据库操作Mapper
* @createDate 2025-06-13 10:38:11
* @Entity src/main/java/com/dy/userservice/com.UserRoles
*/
@Mapper
public interface UserRolesMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserRoles record);

    int insertSelective(UserRoles record);

    UserRoles selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRoles record);

    int updateByPrimaryKey(UserRoles record);

}
