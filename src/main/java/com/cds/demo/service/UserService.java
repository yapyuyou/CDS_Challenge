package com.cds.demo.service;

import com.cds.demo.dao.UserDao;
import com.cds.demo.model.Result;
import com.cds.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("sql") UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return userDao.addUser(user.getName(), user.getSalary());
    }

    public Result getUsers() throws SQLException { return userDao.getUsers(); }
}
