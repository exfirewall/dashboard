package com.maskteam.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    
    @GetMapping("/index")
    public String goHome(){
        return "index";
    }
}
