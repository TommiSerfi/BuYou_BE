package com.buyou.BuYou.controller;

import com.buyou.BuYou.entity.RoleType;
import com.buyou.BuYou.entity.User;
import com.buyou.BuYou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
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
    public @ResponseBody Boolean userLogin(@RequestParam String username, @RequestParam String password){
        return userService.userLogin(username, password);
    }

    @PostMapping(path = "/roleType")
    public @ResponseBody Iterable<User> getRoleType(@RequestParam RoleType roleType){
        return userService.getRoleType(roleType);
    }
}
