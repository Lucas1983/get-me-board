package com.gmb.main.web.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("navbar")
    public String navbar() { return "navbar"; }
}
