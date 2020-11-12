package com.maskteam.dashboard.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.maskteam.dashboard.DTO.AccessTimeDTO;
import com.maskteam.dashboard.models.AccessTime;
import com.maskteam.dashboard.models.Employee;
import com.maskteam.dashboard.repositories.AccessTimeRepository;
import com.maskteam.dashboard.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessTimeService {
    
    @Autowired
    private AccessTimeRepository accesstimeRepository;

    // return list of empolyees
    public List<AccessTimeDTO> getAccesslist() {
        List<AccessTime> AccessEntities = accesstimeRepository.findAll();
        List<AccessTimeDTO> AccessTimeDtoList = new ArrayList<>();

        for (AccessTime AccessEntity : AccessEntities) {
            AccessTimeDTO accesstimeDTO = AccessTimeDTO.builder().id(AccessEntity.getId()).username(AccessEntity.getUsername()).accesstime(AccessEntity.getCreateDate())
                .build();
            AccessTimeDtoList.add(accesstimeDTO);
        }

        return AccessTimeDtoList;
    }

    public void save(AccessTime accessTime) {
        accesstimeRepository.save(accessTime);
    }
    
}
