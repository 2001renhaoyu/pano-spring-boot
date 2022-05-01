package com.example.panospringboot.panoplayer.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2022-05-01
 */
public class Qjmy_res_urls implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String type;

    private String preViewUrl;

    private String res_url;

    private String panoramic_type;

    private Integer radius;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPreViewUrl() {
        return preViewUrl;
    }

    public void setPreViewUrl(String preViewUrl) {
        this.preViewUrl = preViewUrl;
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

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Qjmy_res_urls{" +
        "id=" + id +
        ", type=" + type +
        ", preViewUrl=" + preViewUrl +
        ", res_url=" + res_url +
        ", panoramic_type=" + panoramic_type +
        ", radius=" + radius +
        "}";
    }
}
