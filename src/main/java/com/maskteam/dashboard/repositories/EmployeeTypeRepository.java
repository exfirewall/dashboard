package com.maskteam.dashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maskteam.dashboard.models.EmployeeType;
@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {
    
}
