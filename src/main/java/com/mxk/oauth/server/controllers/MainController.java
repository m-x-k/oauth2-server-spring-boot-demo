package com.mxk.oauth.server.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/user")
    public Principal isLoggedInUser(Principal principal) {
        return principal;
    }

}
