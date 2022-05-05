package com.example.json;

public class Guide_start {
    private float lat;
    private float lon;
    private float fov;

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getFov() {
        return fov;
    }

    public void setFov(float fov) {
        this.fov = fov;
    }



    public Guide_start(float lat, float lon, float fov) {
        this.lat = lat;
        this.lon = lon;
        this.fov = fov;
    }

}
