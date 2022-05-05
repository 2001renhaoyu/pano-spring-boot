package com.example.json;

public class Particle_effect_json {
    String url;
    int num;
    int range;
    String color;
    boolean sizeAttenuation;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSizeAttenuation() {
        return sizeAttenuation;
    }

    public void setSizeAttenuation(boolean sizeAttenuation) {
        this.sizeAttenuation = sizeAttenuation;
    }

    public Particle_effect_json(String url, int num, int range, String color, boolean sizeAttenuation) {
        this.url = url;
        this.num = num;
        this.range = range;
        this.color = color;
        this.sizeAttenuation = sizeAttenuation;
    }


}
