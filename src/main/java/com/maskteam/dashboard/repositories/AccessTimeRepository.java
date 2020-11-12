package com.maskteam.dashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maskteam.dashboard.models.AccessTime;

@Repository
public interface AccessTimeRepository extends JpaRepository<AccessTime, Integer> {
    
}
