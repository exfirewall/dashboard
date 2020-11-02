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
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public String getEmployees(Model model) {

        List<EmployeeDTO> employeeList = employeeService.getEmployeelist();

        model.addAttribute("employee", employeeList);

        return "employee";
    }

    @RequestMapping(value = "/employee/addNew", method = RequestMethod.POST)
    public String addNew(@ModelAttribute EmployeeDTO employeeDto) {
        employeeService.save(employeeDto);
        return "redirect:/employee";
    }

    @RequestMapping("/employee/findById")
    @ResponseBody
    public Optional<Employee> findById(int id) {
        return employeeService.findById(id);
    }

    @RequestMapping(value="/employee/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(@ModelAttribute EmployeeDTO employee){
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @RequestMapping(value="/employee/delete", method={RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        employeeService.delete(id);
        return "redirect:/employee";
    }
}
