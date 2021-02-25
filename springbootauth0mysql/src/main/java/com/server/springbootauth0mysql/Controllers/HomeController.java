package com.server.springbootauth0mysql.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    @GetMapping("/")
    public String homeControllerResponse() {
        return "springbootauth0mysql";
    }
}