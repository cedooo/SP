package com.dhcc.ywp.controller;

import com.dhcc.ywp.po.Country;
import com.dhcc.ywp.service.hello.HelloXXXService;
import com.dhcc.ywp.service.world.WorldCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by cedo on 2016/11/14.
 * controller
 */
@Controller
public class HelloWorldController {

    private HelloXXXService helloService;
    private WorldCountryService worldCountryService;
    @Autowired
    public HelloWorldController(HelloXXXService helloXXXSerivce,
                                     WorldCountryService worldCountryService){
        helloService = helloXXXSerivce;
        this.worldCountryService = worldCountryService;
    }
    @RequestMapping("/hello/{name}")    //handler methods
    public String helloWorld(Model model, @PathVariable String name) {
        String message = helloService.hello(name);
        model.addAttribute("message", message);
        return "helloXXX";
    }
    @RequestMapping("/world/countries")
    public String worldCountries(Model model){
        List<Country> listCountries = worldCountryService.allCountry();
        model.addAttribute("countries", listCountries);
        return "countries";
    }


}
