package com.yangs.springbootemail.dao.impl;

import com.yangs.springbootemail.bean.User;
import com.yangs.springbootemail.dao.IUserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

    public User findUserById(int id) {
        User user = new User(1, "yangs", "123456");
        return user;
    }
}
