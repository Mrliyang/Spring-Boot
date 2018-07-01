package com.yangs.springbootemail.dao;

import com.yangs.springbootemail.bean.User;

public interface IUserDao {

    public User findUserById(int id);

}
