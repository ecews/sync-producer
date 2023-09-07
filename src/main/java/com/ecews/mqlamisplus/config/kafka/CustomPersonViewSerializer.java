package com.ecews.mqlamisplus.config.kafka;

import com.ecews.mqlamisplus.entity.views.PersonView;
import org.apache.kafka.common.serialization.Serializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.util.Map;

public class CustomPersonViewSerializer implements Serializer<PersonView> {

    private  ObjectMapper objectMapper ;



    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        // No specific configuration needed in this example
    }

    @Override
    public byte[] serialize(String topic, PersonView personView) {

        objectMapper = new ObjectMapper();

        objectMapper.registerModule(new JavaTimeModule());



        try {
            // Serialize the PersonView object to a JSON byte array
            return objectMapper.writeValueAsBytes(personView);
        } catch (Exception e) {
            throw new RuntimeException("Error serializing PersonView", e);
        }
    }

    @Override
    public void close() {
        // No resources to release in this example
    }
}

