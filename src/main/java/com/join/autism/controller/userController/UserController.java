package com.join.autism.controller.userController;

import com.join.autism.entity.HzhUser.HzhUser;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {

    @RequestMapping("login")
    public String login(HzhUser user){
        if (!user.getUsername().equals("admin")){
            return "no such user";
        }else if (!user.getPassword().equals("admin")){
            return "incorrect password";
        }else {
            return "success";
        }
    }
}
