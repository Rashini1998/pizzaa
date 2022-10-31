package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @RequestMapping (method = RequestMethod.GET, value = "/")
    public String showHomePage(){
        return "index.html";
    }

}
