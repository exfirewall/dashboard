package com.maskteam.dashboard.services;

import java.util.ArrayList;
import java.util.List;

import com.maskteam.dashboard.DTO.EmployeeDTO;
import com.maskteam.dashboard.models.Employee;
import com.maskteam.dashboard.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeDTO> getEmployeelist(){
    List<Employee> EmployeeEntities = employeeRepository.findAll();
    List<EmployeeDTO> EmployeeDtoList = new ArrayList<>();
    
        for ( Employee EmployeeEntity : EmployeeEntities) {
            EmployeeDTO employeeDTO = EmployeeDTO.builder()
                    .empno(EmployeeEntity.getId())
                    .ename(EmployeeEntity.getEname())
                    .job(EmployeeEntity.getJob())
                    .build();

            EmployeeDtoList.add(employeeDTO);
        }

        return EmployeeDtoList;
    }
}
