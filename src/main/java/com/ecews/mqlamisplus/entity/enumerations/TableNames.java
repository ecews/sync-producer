package com.ecews.mqlamisplus.entity.enumerations;

public enum TableNames {
    PATIENT("PATIENT"), CLINIC("CLINIC"), PHARMACY("PHARMACY"), LABORATORY("LABORATORY");
    private final String status;

    TableNames(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
