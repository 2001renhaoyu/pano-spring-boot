package com.example.json;

import com.example.entity.Qjmy_model;

public class Model_json {

    private String objUrl;
    private String texture;
    private String modeFormat;
    private int scale;



    public String getObjUrl() {
        return objUrl;
    }

    public void setObjUrl(String objUrl) {
        this.objUrl = objUrl;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getModeFormat() {
        return modeFormat;
    }

    public void setModeFormat(String modeFormat) {
        this.modeFormat = modeFormat;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }



    public Model_json(String objUrl, String texture, String modeFormat, int scale) {
        this.objUrl = objUrl;
        this.texture = texture;
        this.modeFormat = modeFormat;
        this.scale = scale;
    }
}
