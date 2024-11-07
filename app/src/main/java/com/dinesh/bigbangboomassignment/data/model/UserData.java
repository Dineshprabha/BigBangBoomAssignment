package com.dinesh.bigbangboomassignment.data.model;

public class UserData {
    private String latitude;
    private String longitude;
    private String isp;
    private String deviceInfo;
    private String keystrokeDynamics;
    private String touchPatterns;
    private String sensorData;

    public UserData(String latitude, String longitude, String isp, String deviceInfo, String keystrokeDynamics, String touchPatterns, String sensorData) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.isp = isp;
        this.deviceInfo = deviceInfo;
        this.keystrokeDynamics = keystrokeDynamics;
        this.touchPatterns = touchPatterns;
        this.sensorData = sensorData;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getKeystrokeDynamics() {
        return keystrokeDynamics;
    }

    public void setKeystrokeDynamics(String keystrokeDynamics) {
        this.keystrokeDynamics = keystrokeDynamics;
    }

    public String getTouchPatterns() {
        return touchPatterns;
    }

    public void setTouchPatterns(String touchPatterns) {
        this.touchPatterns = touchPatterns;
    }

    public String getSensorData() {
        return sensorData;
    }

    public void setSensorData(String sensorData) {
        this.sensorData = sensorData;
    }
}
