package com.example.json;

import java.util.ArrayList;
import java.util.List;

public class res_urls_json {
    private String type;
    private String res_url;
    private String panoramic_type;
    private int radius;


    public res_urls_json(String type, String res_url, String panoramic_type, int radius) {
        this.type = type;
        this.res_url = res_url;
        this.panoramic_type = panoramic_type;
        this.radius = radius;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRes_url() {
        return res_url;
    }

    public void setRes_url(String res_url) {
        this.res_url = res_url;
    }

    public String getPanoramic_type() {
        return panoramic_type;
    }

    public void setPanoramic_type(String panoramic_type) {
        this.panoramic_type = panoramic_type;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


}
