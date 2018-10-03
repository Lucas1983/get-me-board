package com.gmb.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

    @PostMapping("/login")
    @ResponseBody
    public String login() {
        return "Login ...";
    }
}
