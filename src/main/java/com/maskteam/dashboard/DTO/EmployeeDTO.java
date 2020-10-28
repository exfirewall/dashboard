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
    private Integer empno;
    private String ename;
    private String job;

    @Builder
    public EmployeeDTO(Integer empno, String ename, String job) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
    }

    public Employee toEntity(){
        return Employee.builder()
                .empno(empno)
                .ename(ename)
                .job(job)
                .build();
    }
}
