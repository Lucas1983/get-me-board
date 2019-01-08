package com.gmb.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @RequestMapping("/test1")
    public String testRestApi1() {
        return "Test REST API 1";
    }

    @RequestMapping("/test2")
    public String testRestApi2() {
        return "Test REST API 2";
    }
}
