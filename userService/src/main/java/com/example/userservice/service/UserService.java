package com.example.userservice.service;

//import com.example.userservice.entity.User;
import com.example.finapi.entity.User;
import com.example.finapi.util.Result;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;


@Service
public class UserService {
    //Result<ArrayList<User>> result = new Result<>();
    public static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User("B2006","Lisa"));
        users.add(new User("B2007","Amy"));
        users.add(new User("B2008","Mike"));
    }


    public static ArrayList<User> addUser(User user) {
        users.add(user);
        return users;
    }

    public static ArrayList<User> update(String id, String name) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                user.setName(name);
                break;
            }
        }
        return users;
    }

    public static ArrayList<User> delete(String id, String name) {
        users.removeIf(user -> user.getId().equals(id) && user.getName().equals(name));
        return users;
    }

    public static ArrayList<User> getAll() {
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public static String login(@RequestBody User user) {
        for (User u : users)
            if (u.getId().equals(user.getId()) && u.getName().equals(user.getName()))
                return user.getName() + "登陆成功";

        return "登陆失败";
    }

    public static User findById(@RequestBody User user) {
        for (User u : users) {
            if (u.getId().equals(user.getId())) return u;
        }
        return null;
    }

}
