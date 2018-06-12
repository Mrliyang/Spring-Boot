package com.yangs.springbootbegin.service.impl;

import com.yangs.springbootbegin.bean.User;
import com.yangs.springbootbegin.dao.impl.UserDaoImpl;
import com.yangs.springbootbegin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDaoImpl userDao;

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
}
