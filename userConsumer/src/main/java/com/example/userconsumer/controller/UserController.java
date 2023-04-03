package com.example.userconsumer.controller;

import com.example.finapi.entity.User;
import com.example.finapi.util.Result;
import com.example.userconsumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/port")
    public String test() {
        return "获取的内容：" + consumerService.hello();

    }

    @PostMapping("/add")
    public Result<ArrayList<User>> AddUser(@RequestBody User user) {
        return consumerService.AddUser(user);
    }

    @PostMapping("/delete")
    public Result<ArrayList<User>> DeleteUser(@RequestBody User user) {
        return consumerService.DeleteUser(user);
    }
    @PostMapping("/update")
    public Result<ArrayList<User>> UpdateUser(@RequestBody User user){
        return consumerService.UpdateUser(user);
    }
    @GetMapping("/getAll")
    public Result<ArrayList<User>> getALL(){
        return consumerService.getALL();
    }
    @PostMapping("/login")
    public Result<String> login(@RequestBody User user){
        return consumerService.login(user);
    }
    @PostMapping("/findById")
    public Result<User> findById(@RequestBody User user){
        return consumerService.findById(user);
    }
}
