package com.yangs.springbootbegin.dao;

import com.yangs.springbootbegin.bean.User;

public interface IUserDao {

    public User findUserById(int id);

}
