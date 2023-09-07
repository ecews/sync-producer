package com.ecews.mqlamisplus.entity.views.parameters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class SyncRecordParameters {

    public Long facilityId;
    public String tableName;
    public LocalDateTime lastSyncDateTime;
}
