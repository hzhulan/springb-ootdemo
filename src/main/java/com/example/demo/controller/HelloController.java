package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @authod: pp_lan on 2018/12/27.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "hello world";
    }
}
