package com.praveenkumar.uploadingfile.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("com.praveenkumar.shethe.uploadingfile.controller.StorageProperties")
public class StorageProperties {

    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
