package com.szce.os.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 */
@RestController
@RequestMapping(value = "/os")
public class HelloController {
    @RequestMapping(value = "/test")
    public String sayHello(){
        return "index";
    }

    @RequestMapping(value="/modelTest")
    public ModelAndView getModel(){
        return new ModelAndView("index");
    }
}
