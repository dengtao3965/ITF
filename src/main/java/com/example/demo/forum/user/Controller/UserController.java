package com.example.demo.forum.user.Controller;

import com.example.demo.forum.user.bean.User;
import com.example.demo.forum.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/regist")
    public String regist(HttpServletRequest request){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        User user=new User();
        user.setMailbox(username);
        user.setPassword(password);
        userService.register(user);
        return "regist";
    }
}
