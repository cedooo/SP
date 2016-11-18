package com.dhcc.ywp.service.hello;

import com.dhcc.ywp.service.hello.HelloXXXService;
import org.springframework.stereotype.Component;

/**
 * Created by cedo on 2016/11/7.
 * hello Serivce implements
 * helloService标准实现
 */
@Component("helloService")
public class HelloXXXServiceImpl implements HelloXXXService {

    public String hello(String name) {
        return "Hello, " + (name == null ? "---" : name) + " @cedo";

    }

}
