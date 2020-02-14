package com.cds.demo.dao;

import com.cds.demo.model.Result;
import com.cds.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository("sql")
public class SqlUserDataAccess implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addUser(String name, float salary) {
        return 1;
    }

    @Override
    public Result getUsers() throws SQLException {
//        Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
//        Statement statement = conn.createStatement();
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS WHERE SALARY BETWEEN 0 AND 4000");
//        //ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");
//
//        while (resultSet.next()) {
//            System.out.println(resultSet.getString("NAME"));
//            System.out.println(resultSet.getFloat("SALARY"));
//        }
//        conn.close();

        String sql = "SELECT * FROM USERS WHERE SALARY BETWEEN 0 AND 4000";

        List<User> results = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return new Result(results);
//        List<User> temp = new ArrayList<User>();
//        temp.add(new User("Hello", 420));
//        System.out.println(temp);
//        return temp;
    }

}
