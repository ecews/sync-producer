package com.ecews.mqlamisplus.utility;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.IOException;

@Converter
public class JsonNodeConverter implements AttributeConverter<JsonNode, String> {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(JsonNode jsonNode) {
        try {
            return objectMapper.writeValueAsString(jsonNode);
        } catch (IOException e) {
            throw new IllegalArgumentException("Error converting JsonNode to String: " + jsonNode, e);
        }
    }

    @Override
    public JsonNode convertToEntityAttribute(String s) {
        try {
            return objectMapper.readTree(s);
        } catch (IOException e) {
            throw new IllegalArgumentException("Error converting String to JsonNode: " + s, e);
        }
    }
}

