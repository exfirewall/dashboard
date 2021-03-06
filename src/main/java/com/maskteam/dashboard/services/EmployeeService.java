package com.maskteam.dashboard.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.maskteam.dashboard.DTO.EmployeeDTO;
import com.maskteam.dashboard.models.Employee;
import com.maskteam.dashboard.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

@Service
@Configurable
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // return list of empolyees
    public List<EmployeeDTO> getEmployeelist() {
        List<Employee> EmployeeEntities = employeeRepository.findAll();
        List<EmployeeDTO> EmployeeDtoList = new ArrayList<>();

        for (Employee EmployeeEntity : EmployeeEntities) {
            EmployeeDTO employeeDTO = EmployeeDTO.builder().empCode(EmployeeEntity.getCode()).id(EmployeeEntity.getId())
                    .ename(EmployeeEntity.getEname()).job(EmployeeEntity.getJob()).deptId(EmployeeEntity.getDeptId())
                    .build();
            EmployeeDtoList.add(employeeDTO);
        }

        return EmployeeDtoList;
    }

    // Add new employee
    public void save(EmployeeDTO employee) {
        employeeRepository.save(employee.toEntity());
    }

    // Delete employee record
    public void delete(Integer id) {
        employeeRepository.deleteById(id);
    }

    // Get by id
    public Optional<Employee> findById(Integer id) {
        return employeeRepository.findById(id);
    }

    public Optional<Employee> findByName(String name) {
        return employeeRepository.findByEname(name);
    }
}
