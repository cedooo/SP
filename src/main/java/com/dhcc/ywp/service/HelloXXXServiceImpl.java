package com.dhcc.ywp.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cglib.proxy.Dispatcher;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * Created by cedo on 2016/11/7.
 * hello Serivce implements
 */
@Component("main")
public class HelloXXXServiceImpl implements HelloXXXService {

    public String hello(String name) {
        return "Hello, " + (name == null ? "---" : name) + " @cedo";

    }

}
