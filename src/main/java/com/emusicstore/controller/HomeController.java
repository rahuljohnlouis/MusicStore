package com.emusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by RAHUL on 7/20/2016.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home()
    {
        return "home";

    }

}
