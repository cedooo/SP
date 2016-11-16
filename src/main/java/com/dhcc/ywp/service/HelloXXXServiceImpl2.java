package com.dhcc.ywp.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by cedo on 2016/11/8.
 * helloXXXService 2th implement
 */

@Component("se")
public class HelloXXXServiceImpl2 implements HelloXXXService {
    @Override
    public String hello(String name) {
        return "Hey, guys!" + name;
    }
}
