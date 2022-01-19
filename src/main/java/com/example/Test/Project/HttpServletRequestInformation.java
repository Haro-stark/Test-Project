package com.example.Test.Project;

import lombok.Data;


public class HttpServletRequestInformation {
    String methodType;
    String contentType;
    String clientRemoteIpAddress;
    String clientRemoteHostname;
    String clientRealIpAddress;
    String clientRealHostname;
    String clientDeviceType;
    String clientOperatingSystem;
    String clientBrowser;
    Integer contentLength;

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getClientRemoteIpAddress() {
        return clientRemoteIpAddress;
    }

    public void setClientRemoteIpAddress(String clientRemoteIpAddress) {
        this.clientRemoteIpAddress = clientRemoteIpAddress;
    }

    public String getClientRemoteHostname() {
        return clientRemoteHostname;
    }

    public void setClientRemoteHostname(String clientRemoteHostname) {
        this.clientRemoteHostname = clientRemoteHostname;
    }

    public String getClientRealIpAddress() {
        return clientRealIpAddress;
    }

    public void setClientRealIpAddress(String clientRealIpAddress) {
        this.clientRealIpAddress = clientRealIpAddress;
    }

    public String getClientRealHostname() {
        return clientRealHostname;
    }

    public void setClientRealHostname(String clientRealHostname) {
        this.clientRealHostname = clientRealHostname;
    }

    public String getClientDeviceType() {
        return clientDeviceType;
    }

    public void setClientDeviceType(String clientDeviceType) {
        this.clientDeviceType = clientDeviceType;
    }

    public String getClientOperatingSystem() {
        return clientOperatingSystem;
    }

    public void setClientOperatingSystem(String clientOperatingSystem) {
        this.clientOperatingSystem = clientOperatingSystem;
    }

    public String getClientBrowser() {
        return clientBrowser;
    }

    public void setClientBrowser(String clientBrowser) {
        this.clientBrowser = clientBrowser;
    }

    public Integer getContentLength() {
        return contentLength;
    }

    public void setContentLength(Integer contentLength) {
        this.contentLength = contentLength;
    }
}
