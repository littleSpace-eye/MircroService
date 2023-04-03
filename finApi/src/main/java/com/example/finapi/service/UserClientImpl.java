package com.example.finapi.service;

import com.example.finapi.entity.User;
import com.example.finapi.util.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserClientImpl implements UserClient {

    @Override
    public Result<String> test() {
        return Result.error();
    }

    @Override
    public Result<ArrayList<User>> AddUser(User user) {
        return Result.error();
    }

    @Override
    public Result<ArrayList<User>> DeleteUser(User user) {
        return Result.error();
    }

    @Override
    public Result<ArrayList<User>> UpdateUser(User user) {
        return Result.error();
    }

    @Override
    public Result<ArrayList<User>> getALL() {
        return Result.error();
    }

    @Override
    public Result<String> login(User user) {
        return Result.error();
    }

    @Override
    public Result<User> findById(User user) {
        return Result.error();
    }

    @Override
    public Result<String> hello() {
        return Result.error();
    }
}
