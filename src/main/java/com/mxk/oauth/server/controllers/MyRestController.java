package com.mxk.oauth.server.controllers;

import com.mxk.oauth.server.model.MySample;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping("/rest/my/sample")
    public MySample getMySample() {
        return new MySample("hello", "world");
    }


}
