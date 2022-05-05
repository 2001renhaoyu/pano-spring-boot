package com.example.json;

public class Spot_json {
    private String hs_key;
    private float lat;
    private float lon;
    private boolean animate;
    private String name;
    private String title;
    private String res_url;

    public String getHs_key() {
        return hs_key;
    }

    public void setHs_key(String hs_key) {
        this.hs_key = hs_key;
    }

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

    public boolean isAnimate() {
        return animate;
    }

    public void setAnimate(boolean animate) {
        this.animate = animate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRes_url() {
        return res_url;
    }

    public void setRes_url(String res_url) {
        this.res_url = res_url;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public int getImg_height() {
        return img_height;
    }

    public void setImg_height(int img_height) {
        this.img_height = img_height;
    }

    public int getImt_width() {
        return imt_width;
    }

    public void setImt_width(int imt_width) {
        this.imt_width = imt_width;
    }

    private String img_url;
    private int img_height;
    private int imt_width;

    public Spot_json(String hs_key, float lat, float lon, boolean animate, String name, String title, String res_url, String img_url, int img_height, int imt_width) {
        this.hs_key = hs_key;
        this.lat = lat;
        this.lon = lon;
        this.animate = animate;
        this.name = name;
        this.title = title;
        this.res_url = res_url;
        this.img_url = img_url;
        this.img_height = img_height;
        this.imt_width = imt_width;
    }






}
