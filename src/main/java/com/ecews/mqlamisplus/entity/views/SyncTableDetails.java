package com.ecews.mqlamisplus.entity.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class SyncTableDetails {
    public String tableName;
    public String tableDescription;
    public int numberOfRecords;
    public int numberOfNewlyCreatedRecords;
    public LocalDateTime dateAndTimeLastSynced;
}
