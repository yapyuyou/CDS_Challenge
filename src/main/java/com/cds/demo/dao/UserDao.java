package com.cds.demo.dao;

import com.cds.demo.model.Result;

import java.sql.SQLException;

public interface UserDao {

    Result getUsers() throws SQLException;
}
