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
public class Qjmy_hot_spot implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer id_scene;

    private Float lat;

    private Float lon;

    private Boolean animate;

    private String name;

    private String title;

    private Integer title_width;

    private String res_url;

    private Float opacity;

    private Float scale;

    private String img_url;

    private Integer img_height;

    private Integer img_width;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getId_scene() {
        return id_scene;
    }

    public void setId_scene(Integer id_scene) {
        this.id_scene = id_scene;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Boolean getAnimate() {
        return animate;
    }

    public void setAnimate(Boolean animate) {
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

    public Integer getTitle_width() {
        return title_width;
    }

    public void setTitle_width(Integer title_width) {
        this.title_width = title_width;
    }

    public String getRes_url() {
        return res_url;
    }

    public void setRes_url(String res_url) {
        this.res_url = res_url;
    }

    public Float getOpacity() {
        return opacity;
    }

    public void setOpacity(Float opacity) {
        this.opacity = opacity;
    }

    public Float getScale() {
        return scale;
    }

    public void setScale(Float scale) {
        this.scale = scale;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public Integer getImg_height() {
        return img_height;
    }

    public void setImg_height(Integer img_height) {
        this.img_height = img_height;
    }

    public Integer getImg_width() {
        return img_width;
    }

    public void setImg_width(Integer img_width) {
        this.img_width = img_width;
    }

    @Override
    public String toString() {
        return "Qjmy_hot_spot{" +
        "id=" + id +
        ", id_scene=" + id_scene +
        ", lat=" + lat +
        ", lon=" + lon +
        ", animate=" + animate +
        ", name=" + name +
        ", title=" + title +
        ", title_width=" + title_width +
        ", res_url=" + res_url +
        ", opacity=" + opacity +
        ", scale=" + scale +
        ", img_url=" + img_url +
        ", img_height=" + img_height +
        ", img_width=" + img_width +
        "}";
    }
}
