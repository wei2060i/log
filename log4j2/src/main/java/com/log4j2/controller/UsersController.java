package com.log4j2.controller;


import com.log4j2.beans.po.Users;
import com.log4j2.service.IUsersService;
import com.log4j2.tool.log.LogTool;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WeiWei
 * @since 2020-09-15
 */
@RestController
@CrossOrigin(allowCredentials = "true")
@RequestMapping("/users")
public class UsersController {

    private static final Logger platformLogger = LogTool.getPlatformLogger();
    private static final Logger exceptionLogger = LogTool.getExceptionLogger();
    @Resource
    private IUsersService usersService;

    @GetMapping
    public void testLog() {
        List<Users> list = usersService.list();
        platformLogger.info("用户数量size:" + list.size());
        exceptionLogger.error("测试溢出");
    }

}

