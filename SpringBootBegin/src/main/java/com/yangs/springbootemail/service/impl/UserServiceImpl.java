package com.yangs.springbootemail.service.impl;

import com.yangs.springbootemail.bean.User;
import com.yangs.springbootemail.dao.impl.UserDaoImpl;
import com.yangs.springbootemail.service.IUserService;
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
