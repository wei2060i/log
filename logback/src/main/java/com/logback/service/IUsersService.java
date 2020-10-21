package com.logback.service;

import com.logback.beans.po.Users;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WeiWei
 * @since 2020-10-08
 */
public interface IUsersService extends IService<Users> {

    List<Users> getUserOverView();
}
