package com.mr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ww on 2019/10/24.
 */
@RestController
public class Test {
    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
}
