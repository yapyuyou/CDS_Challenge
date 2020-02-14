package com.cds.demo.dao;

import com.cds.demo.model.Result;
import com.cds.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository("sql")
public class SqlUserDataAccess implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Result getUsers() throws SQLException {
        String sql = "SELECT * FROM USERS WHERE SALARY BETWEEN 0 AND 4000";

        List<User> results = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return new Result(results);
    }
}
