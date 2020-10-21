package com.maskteam.dashboard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    
    @GetMapping("/Employee")
    public String getEmployees(){
        return "Employee";
    }
}
