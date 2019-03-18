package com.example.demo.forum.user.service.impl;

import com.example.demo.forum.user.bean.User;
import com.example.demo.forum.user.repository.UserRepository;
import com.example.demo.forum.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean register(User user) {
        userRepository.save(user);
        return false;
    }

    @Override
    public User login(User user) {
        return null;
    }

    @Override
    public boolean checkMail(String mail) {
        return false;
    }

    @Override
    public void updateUserInfo(User user) {

    }

    @Override
    public User queryUserInfo(int userId) {
        return null;
    }

    @Override
    public List<User> getUserList(User user) {
        return null;
    }
}
