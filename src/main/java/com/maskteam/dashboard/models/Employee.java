package com.maskteam.dashboard.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // This tells Hibernate to make a table out of this class
@Getter
@Builder
@NoArgsConstructor
@Table(name="employee")
public class Employee {
  @Id
  @Column(name="employee_id")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;

  @Column(name="employee_code")
  private Integer empCode;

  @Column(name="employee_name")
  private String ename;

  @Column(name="job")
  private String job;

  @Column(name="department_id")
  private Integer deptId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getCode() {
    return empCode;
  }

  public void setCode(Integer empCode) {
    this.empCode = empCode;
  }

  public String getName() {
    return ename;
  }

  public void setName(String name) {
    this.ename = name;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public Integer getDeptId() {
    return deptId;
  }

  public void setDeptId(Integer deptId) {
    this.deptId = deptId;
  }

  @Builder
    public Employee(Integer empCode, Integer id, String ename, String job, Integer deptId) {
        this.empCode = empCode;
        this.id = id;
        this.ename = ename;
        this.job = job;
        this.deptId = deptId;
	}
}