package com.dhcc.ywp.service;

import com.dhcc.ywp.service.HelloXXXService;
import com.dhcc.ywp.service.HelloXXXServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

/**
 * Created by cedo on 2016/11/7.
 * spring java-annotated configuration
 */
@Configuration
@ComponentScan(basePackages = "com.dhcc.ywp.service")
public class HelloXXXConfig {

    /*@Bean
    public HelloXXXService helloXXX(){
        return new HelloXXXServiceImpl();
    }*/

}
