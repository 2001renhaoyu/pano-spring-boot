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
public class Qjmy_particle_effect implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer id_scene;

    private String url;

    private Integer num;

    private Integer prange;

    private String color;

    private Boolean size_attenuation;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getPrange() {
        return prange;
    }

    public void setPrange(Integer prange) {
        this.prange = prange;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getSize_attenuation() {
        return size_attenuation;
    }

    public void setSize_attenuation(Boolean size_attenuation) {
        this.size_attenuation = size_attenuation;
    }

    @Override
    public String toString() {
        return "Qjmy_particle_effect{" +
        "id=" + id +
        ", id_scene=" + id_scene +
        ", url=" + url +
        ", num=" + num +
        ", prange=" + prange +
        ", color=" + color +
        ", size_attenuation=" + size_attenuation +
        "}";
    }
}
