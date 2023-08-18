package com.ecews.mqlamisplus.entity.models.dataSync;//package com.ecews.mqlamisplus.entity.models.dataSync;
//
//import com.blazebit.persistence.view.EntityView;
//import com.blazebit.persistence.view.Mapping;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import java.time.LocalDateTime;
//
//@Data
//@Entity
//@Table(name = "datasync")
//@AllArgsConstructor
//@NoArgsConstructor
//public class DataSync {
//
////    @Id
////    private UUID patientId;
//    private Long facilityId;
//    private LocalDateTime tableSyncDate;
//    private LocalDateTime tableName;
//
//
//
//
//    @EntityView(DataSync.class)
//    public interface MaxSyncTime {
//
//        @Mapping("facilityId")
//        LocalDateTime getFacilityId();
//        @Mapping("tableSyncDate")
//        LocalDateTime getTableSyncDate();
//        @Mapping("tableName")
//        LocalDateTime getTableName();
//
//    }
//
//
//
//
//
//
//
//
////
////    private LocalDateTime patientTableSyncDate;
////    private LocalDateTime clinicTableSyncDate;
////    private LocalDateTime laboratoryTableSyncDate;
////    private LocalDateTime pharmacyTableSyncDate;
//
////    @EntityView(DataSync.class)
////    public interface MaxSyncTime {
////
////        @Mapping("MAX(patientTableSyncDate)")
////        LocalDateTime getMaxPatientTableSyncDate();
////        @Mapping("MAX(laboratoryTableSyncDate)")
////        LocalDateTime getMaxLaboratoryTableSyncDate();
////        @Mapping("MAX(clinicTableSyncDate)")
////        LocalDateTime getMaxClinicTableSyncDate();
////        @Mapping("MAX(pharmacyTableSyncDate)")
////        LocalDateTime getMaxPharmacyTableSyncDate();
////
////    }
//
//
//
//}
