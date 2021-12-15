package com.buyou.BuYou.controller;

import com.buyou.BuYou.entity.RoleType;
import com.buyou.BuYou.entity.User;
import com.buyou.BuYou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
@CrossOrigin("http://localhost:4200")
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestBody User user){
        return userService.addNewUser(user);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping(path = "/login")
    public @ResponseBody
    Optional<User> userLogin(@RequestParam String username, @RequestParam String password) throws Exception {
        return userService.getUserLogin(username, password);
    }

    @PostMapping(path = "/roleType")
    public @ResponseBody Iterable<User> getRoleType(@RequestParam RoleType roleType){
        return userService.getRoleType(roleType);
    }
}
