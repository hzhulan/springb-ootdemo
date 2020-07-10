package com.example.demo.service;

import com.example.demo.bean.RspMsg;
import com.example.demo.dao.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @authod: pp_lan on 2020/7/11.
 */
@Service
public class TestService {

    @Resource
    TestMapper dao;

    public RspMsg queryAllStudent() {
        try {
            RspMsg rsp = RspMsg.success(dao.queryAllStudents());
            return rsp;
        } catch (Exception e) {
            e.printStackTrace();
            return RspMsg.error(e.getMessage());
        }
    }
}
