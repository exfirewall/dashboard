package com.maskteam.dashboard.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    
    @GetMapping("/Employee")
    public String getEmployees(){
        return "Employee";
    }
}
