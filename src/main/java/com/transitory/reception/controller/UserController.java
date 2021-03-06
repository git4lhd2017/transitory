package com.transitory.reception.controller;

import com.transitory.reception.beans.Manager;
import com.transitory.reception.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<Manager> findAll(){
        return userService.findAll();
    }





}
