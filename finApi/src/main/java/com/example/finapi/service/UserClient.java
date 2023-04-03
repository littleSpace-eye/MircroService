package com.example.finapi.service;

import com.example.finapi.config.FeiConfiger;
import com.example.finapi.entity.User;
import com.example.finapi.util.Result;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@FeignClient(name = "userService", path = "/user", configuration = FeiConfiger.class, fallback = UserClientImpl.class)

@Service
public interface UserClient {

    @GetMapping("/port")
    Result<String> test();

    @PostMapping("/add")
    Result<ArrayList<User>> AddUser(@RequestBody User user);

//    default User getUserFallback(User user) {return new User(user.getId(),getUserFallback(user)};;


    @PostMapping("/delete")
    Result<ArrayList<User>> DeleteUser(@RequestBody User user);

    @PostMapping("/update")
    Result<ArrayList<User>> UpdateUser(@RequestBody User user);

    @GetMapping("/getAll")
    Result<ArrayList<User>> getALL();

    @PostMapping("/login")
    Result<String> login(@RequestBody User user);

    @PostMapping("/findById")
    Result<User> findById(@RequestBody User user);

    @GetMapping("/user/hello")
    Result<String> hello();

}
