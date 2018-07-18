package com.szce.im.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: spy
 * @Date: 2018/7/16 21:04
 * @Description:
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView test(){
        return new ModelAndView("index");
    }

}
