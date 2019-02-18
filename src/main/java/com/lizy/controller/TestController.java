package com.lizy.controller;

import com.lizy.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Lizhengyuan on 19-2-14
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("getUser")
    public Object getUser(){
        return new User(1,"lizy","dsfd");
    }



}
