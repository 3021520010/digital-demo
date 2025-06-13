package com.dy.permissionservice.controller;

import com.dy.permissionservice.servcie.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    // 绑定默认角色
    @GetMapping("/bind-default")
    public void bindDefaultRole(@RequestParam("userId") Long userId) {
        permissionService.bindDefaultRole(userId);
    }

    // 查询角色码
    @GetMapping("/role-code/{userId}")
    public String getUserRoleCode(@PathVariable Long userId) {
        return permissionService.getUserRoleCode(userId);
    }

    // 升级为管理员
    @PostMapping("/upgrade-admin/{userId}")
    public void upgradeToAdmin(@PathVariable Long userId) {
        permissionService.upgradeToAdmin(userId);
    }

    // 降级为普通用户
    @PostMapping("/downgrade-user/{userId}")
    public void downgradeToUser(@PathVariable Long userId) {
        permissionService.downgradeToUser(userId);
    }
}
