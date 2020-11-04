package com.maskteam.dashboard.controllers;

import java.util.List;
import java.util.Optional;

import com.maskteam.dashboard.DTO.EmployeeDTO;
import com.maskteam.dashboard.models.Employee;
import com.maskteam.dashboard.repositories.EmployeeRepository;
import com.maskteam.dashboard.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccessTimeController {

    @Autowired
    private EmployeeService accessTimeService;

    @GetMapping("/accesstime")
    public String goAccessTable() {
        return "accesstime";
    }
}