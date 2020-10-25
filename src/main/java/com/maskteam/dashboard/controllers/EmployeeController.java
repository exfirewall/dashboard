package com.maskteam.dashboard.controllers;

import java.util.List;
import com.maskteam.dashboard.services.EmployeeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/Employee")
    public String getEmployees(Model model){

        model.addAllAttributes("employees", employeeList);
        return "Employee";
    }
}
