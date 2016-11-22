package com.dhcc.ywp.service.hello.impl;

import com.dhcc.ywp.service.hello.HelloXXXService;

/**
 * Created by cedo on 2016/11/8.
 * helloXXXService 2th implement
 */

//@Component("se")
public class HelloXXXServiceImpl2 implements HelloXXXService {

    public String hello(String name) {
        return "Hey, guys!" + name;
    }

}
