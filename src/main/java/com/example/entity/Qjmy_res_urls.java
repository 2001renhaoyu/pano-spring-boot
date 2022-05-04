package com.example.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 郝星然
 * @since 2022-05-04
 */
public class Qjmy_res_urls implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String type;

    private String preview_url;

    private String res_url;

    private String panoramic_type;

    private Integer radius;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPreview_url() {
        return preview_url;
    }

    public void setPreview_url(String preview_url) {
        this.preview_url = preview_url;
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
        ", preview_url=" + preview_url +
        ", res_url=" + res_url +
        ", panoramic_type=" + panoramic_type +
        ", radius=" + radius +
        "}";
    }
}
