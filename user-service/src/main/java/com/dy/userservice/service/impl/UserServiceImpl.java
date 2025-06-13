package com.dy.userservice.service.impl;

import com.dy.userservice.entity.Users;
import com.dy.userservice.mapper.UsersMapper;
import com.dy.userservice.service.IUSerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUSerService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void register(Users user) {
        try {
            //TODO 密码加密，验证一下用户名不能重复
            usersMapper.insert(user);
        }catch (Exception e){

        }
    }
}
