package com.arifin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by arifin on 31/10/16.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home()
    {
        return "home";
    }
}
