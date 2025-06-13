package com.dy.userservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "permission-service" ,url = "localhost:8082")
public interface PermissionClient {

    @GetMapping("/permission/bind-default")
    void bindDefaultRole(@RequestParam("userId") Long userId);

    @GetMapping("/permission/getUserRoleCode")
    String getUserRoleCode(@RequestParam("userId") Long userId);

    @PostMapping("/permission/upgradeToAdmin")
    void upgradeToAdmin(@RequestParam("userId") Long userId);

    @PostMapping("/permission/downgradeToUser")
    void downgradeToUser(@RequestParam("userId") Long userId);
}

