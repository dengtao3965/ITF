package com.example.demo.forum.user.service;

import com.example.demo.forum.user.bean.User;

import java.util.List;

public interface UserService {

    public boolean register(User user);

    public User login(User user);

    public boolean checkMail(String mail);

    public void updateUserInfo(User user);

    public User queryUserInfo(int userId);

    public List<User> getUserList(User user);
}
