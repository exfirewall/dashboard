package com.maskteam.dashboard.controllers;

import java.util.List;

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
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public String getEmployees(Model model){

        List<EmployeeDTO> employeeList = employeeService.getEmployeelist();

        model.addAttribute("employee", employeeList);
        
        return "employee";
    }

    @RequestMapping(value="/employee/addNew", method=RequestMethod.POST)
    public String addNew(@ModelAttribute EmployeeDTO employeeDto){
        System.out.println(employeeDto.getEmpno());
        System.out.println(employeeDto.getEname());
        System.out.println(employeeDto.getJob());

        employeeService.save(employeeDto);
        return "redirect:/employee";
    }

    /* @PostMapping("/customer")
    public String createCustomer(Customer customer, Model model) {
    customerRepository.save(customer);
    return "customer";
    }*/
}
