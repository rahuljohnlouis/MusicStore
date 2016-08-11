package com.emusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by RAHUL on 8/10/2016.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home()
    {
        return "home";
    }
}
