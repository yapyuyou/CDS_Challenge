package com.cds.demo.api;

import com.cds.demo.model.Result;
import com.cds.demo.model.User;
import com.cds.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RequestMapping("users")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Result getUsers() throws SQLException {
        return userService.getUsers();
    }

}
