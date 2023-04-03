package com.example.userconsumer.service;

import com.example.finapi.entity.User;
import com.example.finapi.service.UserClient;
import com.example.finapi.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class ConsumerService {
    @Autowired
    private UserClient userClient;

    public Result<ArrayList<User>> AddUser(@RequestBody User user){
        return userClient.AddUser(user);
    }
    public Result<ArrayList<User>> DeleteUser(@RequestBody User user){
        return userClient.DeleteUser(user);
    }
    public Result<ArrayList<User>> UpdateUser(@RequestBody User user){
        return userClient.UpdateUser(user);
    }

    public Result<ArrayList<User>> getALL(){
        return userClient.getALL();
    }

    public Result<String> login(@RequestBody User user){
        return userClient.login(user);
    }

    public Result<User> findById(@RequestBody User user){
        return userClient.findById(user);
    }
    public String hello() {
        return "提供者提供的端口：" ;
    }




}
