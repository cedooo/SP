package com.dhcc.ywp.controller;

import com.dhcc.ywp.service.HelloXXXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cedo on 2016/11/14.
 * controller
 */
@Controller
@RequestMapping("/appointments")
public class HelloWorldController {

    private HelloXXXService helloService;
    @Autowired
    public void HelloWorldController(@Qualifier("helloService") HelloXXXService serivce){
        helloService = serivce;
    }
    @RequestMapping("/helloWorld/{name}")    //handler methods
    public String helloWorld(Model model, @PathVariable String name) {
        String message = helloService.hello(name);
        model.addAttribute("message", message);
        return "helloXXX";
    }

    @GetMapping("/getHello/{name}")
    public String getHello(Model model, @PathVariable String name) {
        String message = helloService.hello(name);
        model.addAttribute("message", "get message by GET ." + message);
        return "helloXXX";
    }
}
