package com.example.userservice.controller;

import com.example.finapi.entity.User;
import com.example.finapi.util.Result;
import com.example.userservice.service.UserService;
//import com.example.userservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static com.example.userservice.service.UserService.users;

@RestController
public class UserController {
    @Value("${server.port}")
    private String port;


    @Autowired
    UserService userService;

    @GetMapping("/user/hello")
    public String hello() {
        return "提供者提供的端口：" + port;
    }

    @PostMapping("/user/add")
    public Result<ArrayList<User>> add(@RequestBody User user) {
         userService.addUser(user);
         return Result.ok(userService.addUser(user));

    }

    @PostMapping("/user/update")
    public Result<ArrayList<User>> update(@RequestBody User user) {
        return Result.ok( userService.update(user.getId(), user.getName()));
    }

    @PostMapping("/user/delete")
    public Result<ArrayList<User>> delete(@RequestBody User user) {

        return Result.ok(userService.delete(user.getId(), user.getName()));
    }

    @GetMapping("/user/getAll")
    public Result<ArrayList<User>> getAll() {return Result.ok(userService.getAll());}
    @PostMapping("/user/login")
    public Result<String> login(@RequestBody User user){
        return Result.ok(userService.login(user));
    }
    @PostMapping("/user/findById")
    public Result< User >findById(@RequestBody User user){
        return Result.ok(userService.findById(user));
    }



}
