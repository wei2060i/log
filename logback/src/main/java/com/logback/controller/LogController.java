package com.logback.controller;

import com.logback.beans.po.Users;
import com.logback.service.IUsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sky
 * @date 2020/10/8 16:19
 */
@RestController
@CrossOrigin(allowCredentials = "true")
@RequestMapping("/log")
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @Resource
    private IUsersService usersService;

    @GetMapping("hello")
    public void getUserOverView() {
        for (int i = 0; i < 1; i++) {
            logger.info("info");
        }
        logger.error("error");
        logger.warn("warn");
        List<Users> userOverView = usersService.getUserOverView();

    }

}
