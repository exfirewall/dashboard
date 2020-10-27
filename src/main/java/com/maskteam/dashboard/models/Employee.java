package com.maskteam.dashboard.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

@Entity // This tells Hibernate to make a table out of this class
public class Employee {
  @Id
  @Column(name="empno")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer empno;

  @Column(name="ename")
  private String ename;

  @Column(name="job")
  private String job;

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

  public void setEmail(String job) {
    this.job = job;
  }
}