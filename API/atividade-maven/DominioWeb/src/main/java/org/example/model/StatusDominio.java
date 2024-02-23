package org.example.model;

import com.google.gson.annotations.SerializedName;

public class StatusDominio {

    private String status;


    private String expiresAt;

    public StatusDominio() {
    }

    public StatusDominio(String status, String expiresAt) {
        this.status = status;
        this.expiresAt = expiresAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }
}
