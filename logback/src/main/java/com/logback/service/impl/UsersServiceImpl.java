package com.logback.service.impl;

import com.logback.beans.po.Users;
import com.logback.dao.UsersDao;
import com.logback.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WeiWei
 * @since 2020-10-08
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersDao, Users> implements IUsersService {

    @Resource
    private UsersDao usersDao;

    @Override
    public List<Users> getUserOverView() {
        return usersDao.selectList(null);
    }
}
