package com.ecews.mqlamisplus.publisher.kafkaproducer;


import com.ecews.mqlamisplus.entity.views.parameters.SyncRecordParameters;

public interface ProducerImpl {
    void produceAndSyncData(SyncRecordParameters syncRecordParameters);
}
