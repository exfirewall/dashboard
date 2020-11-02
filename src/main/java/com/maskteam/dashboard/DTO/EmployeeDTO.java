package com.maskteam.dashboard.DTO;

import com.maskteam.dashboard.models.Employee;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.Builder;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeDTO {
    private Integer empCode;
    private Integer id;
    private String ename;
    private String job;
    private Integer deptId;

    @Builder
    public EmployeeDTO(Integer empCode, Integer id, String ename, String job, Integer deptId) {
        this.empCode= empCode;
        this.id = id;
        this.ename = ename;
        this.job = job;
        this.deptId = deptId;
    }

    public Employee toEntity(){
        return Employee.builder()
                .empCode(empCode)
                .id(id)
                .ename(ename)
                .job(job)
                .deptId(deptId)
                .build();
    }
}
