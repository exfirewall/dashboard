package com.maskteam.dashboard.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "access_time")
public class AccessTime {

    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employee_name")
    private String username;

    @Column(name = "date_time")
    private Timestamp accesstime;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Timestamp getCreateDate() {
        return accesstime;
    }
    public void setCreateDate(Timestamp accesstime) {
        this.accesstime = accesstime;
    }

    @Builder
    public AccessTime(int id, String username, Timestamp accesstime) {
        this.id = id;
        this.username = username;
        this.accesstime = accesstime;
    }
}

