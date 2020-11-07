package com.maskteam.dashboard.DTO;

import java.sql.Timestamp;

import com.maskteam.dashboard.models.AccessTime;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.Builder;

@Getter
@Setter
@NoArgsConstructor
public class AccessTimeDTO {
    private int id;
    private String username;
    private Timestamp accesstime;

    @Builder
    public AccessTimeDTO(int id, String username, Timestamp accesstime) {
        this.id = id;
        this.username = username;
        this.accesstime = accesstime;
    }

    public AccessTime toEntity(){
        return AccessTime.builder()
                .id(id)
                .username(username)
                .accesstime(accesstime)
                .build();
    }
}
