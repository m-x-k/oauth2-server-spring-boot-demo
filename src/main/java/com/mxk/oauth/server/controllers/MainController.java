package com.mxk.oauth.server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class MainController {

    @RequestMapping("/")
    public String test() {
        return "test";
    }

    @RequestMapping("/login")
    public String login() {
        return "click";
    }

    @RequestMapping({ "/user", "/me" })
    public Map<String, String> user(Principal principal) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("name", principal.getName());
        return map;
    }

}
