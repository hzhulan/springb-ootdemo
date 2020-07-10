package com.example.demo.controller;

import com.example.demo.bean.RspMsg;
import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @authod: pp_lan on 2020/7/11.
 */
@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/all")
    @ResponseBody
    public RspMsg queryAllStudents() {

        return testService.queryAllStudent();
    }
}
