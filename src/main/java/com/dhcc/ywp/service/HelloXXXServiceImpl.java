package com.dhcc.ywp.service;

import org.springframework.stereotype.Component;

/**
 * Created by cedo on 2016/11/7.
 * hello Serivce implements
 */
@Component
public class HelloXXXServiceImpl implements HelloXXXService {

    public String hello(String name) {
        return "Hello, " + (name == null ? "---" : name);
    }

}
