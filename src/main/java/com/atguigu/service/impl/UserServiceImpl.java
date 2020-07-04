package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

//    @Autowired   //spring提供的
    @Resource   //也可以依赖注入  jdk提供的
    UserDao userDao;

//    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    @Transactional(readOnly = true)   //加事务
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
