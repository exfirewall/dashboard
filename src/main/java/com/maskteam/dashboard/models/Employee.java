package com.maskteam.dashboard.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

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
  @Column(name="empno")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer empno;

  @Column(name="ename")
  private String ename;

  @Column(name="job")
  private String job;

  @Column(name="deptno")
  private Integer deptId;

  public Integer getId() {
    return empno;
  }

  public void setId(Integer id) {
    this.empno = id;
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
    public Employee(Integer empno, String ename, String job, Integer deptId) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.deptId = deptId;
	}
}