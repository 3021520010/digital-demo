package com.dy.permissionservice.servcie.impl;

import com.dy.permissionservice.servcie.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PermissionServiceImpl implements PermissionService {
    @Override
    public void bindDefaultRole(Long userId) {
      log.error("绑定默认角色开始");
    }

    @Override
    public String getUserRoleCode(Long userId) {
        return "";
    }

    @Override
    public void upgradeToAdmin(Long userId) {

    }

    @Override
    public void downgradeToUser(Long userId) {

    }
}
