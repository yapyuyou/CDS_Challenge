package com.cds.demo.dao;

import com.cds.demo.model.Result;

import java.sql.SQLException;

public interface UserDao {

    int addUser(String name, float salary);

    Result getUsers() throws SQLException;
}
