package com.maskteam.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.maskteam.dashboard.client.RaspClient;
@Controller
public class AppController {
    
    @GetMapping("/index")
    public String goHome(){
        //Socket client to rasp Server...
        RaspClient client = new RaspClient(1);
        System.out.println(client.getResult());

        return "index";
    }
}
