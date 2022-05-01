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
public class Qjmy_particle_effect implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id_scene;

    private String url;

    private Integer num;

    private Integer range;

    private String color;

    private Boolean sizeAttenuation;


    public Integer getId_scene() {
        return id_scene;
    }

    public void setId_scene(Integer id_scene) {
        this.id_scene = id_scene;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getSizeAttenuation() {
        return sizeAttenuation;
    }

    public void setSizeAttenuation(Boolean sizeAttenuation) {
        this.sizeAttenuation = sizeAttenuation;
    }

    @Override
    public String toString() {
        return "Qjmy_particle_effect{" +
        "id_scene=" + id_scene +
        ", url=" + url +
        ", num=" + num +
        ", range=" + range +
        ", color=" + color +
        ", sizeAttenuation=" + sizeAttenuation +
        "}";
    }
}
