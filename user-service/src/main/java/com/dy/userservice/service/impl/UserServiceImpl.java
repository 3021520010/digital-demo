package com.dy.userservice.service.impl;

import com.dy.userservice.client.PermissionClient;
import com.dy.userservice.entity.Users;
import com.dy.userservice.mapper.UsersMapper;
import com.dy.userservice.service.IUSerService;
import com.dy.userservice.utils.PasswordUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements IUSerService {
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private PermissionClient permissionClient;
    @Override
    public void register(Users user) {
        try {
//            checkUser(user);
//            Users isExist = usersMapper.selectByUserName(user.getUsername());
//            if(isExist!=null){
//                throw new Exception("用户名重复");
//            }
//            String password = user.getPassword();
//            password= PasswordUtil.encode(password);
//            user.setPassword(password);
//            usersMapper.insert(user);
            permissionClient.bindDefaultRole(11L);
            //TODO RPC调用写权限,MQ发消息
        }catch (Exception e){
            log.error("注册失败"+e.getMessage());
        }
    }
    void checkUser(Users user){
        if(user.getUsername()==null){
            throw new RuntimeException("用户名不能为空");
        }
        if(user.getPassword()==null){
            throw new RuntimeException("密码不能为空");
        }
    }
}
