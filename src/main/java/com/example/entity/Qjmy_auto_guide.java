package com.example.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 郝欣然
 * @since 2022-05-03
 */
public class Qjmy_auto_guide implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String key;

    private Integer id_scene;

    private Float start_lat;

    private Float start_lon;

    private Float start_fov;

    private Float end_lat;

    private Float end_lon;

    private Float end_fov;

    private Integer duration;

    private String easing;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getId_scene() {
        return id_scene;
    }

    public void setId_scene(Integer id_scene) {
        this.id_scene = id_scene;
    }

    public Float getStart_lat() {
        return start_lat;
    }

    public void setStart_lat(Float start_lat) {
        this.start_lat = start_lat;
    }

    public Float getStart_lon() {
        return start_lon;
    }

    public void setStart_lon(Float start_lon) {
        this.start_lon = start_lon;
    }

    public Float getStart_fov() {
        return start_fov;
    }

    public void setStart_fov(Float start_fov) {
        this.start_fov = start_fov;
    }

    public Float getEnd_lat() {
        return end_lat;
    }

    public void setEnd_lat(Float end_lat) {
        this.end_lat = end_lat;
    }

    public Float getEnd_lon() {
        return end_lon;
    }

    public void setEnd_lon(Float end_lon) {
        this.end_lon = end_lon;
    }

    public Float getEnd_fov() {
        return end_fov;
    }

    public void setEnd_fov(Float end_fov) {
        this.end_fov = end_fov;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getEasing() {
        return easing;
    }

    public void setEasing(String easing) {
        this.easing = easing;
    }

    @Override
    public String toString() {
        return "Qjmy_auto_guide{" +
        "id=" + id +
        ", key=" + key +
        ", id_scene=" + id_scene +
        ", start_lat=" + start_lat +
        ", start_lon=" + start_lon +
        ", start_fov=" + start_fov +
        ", end_lat=" + end_lat +
        ", end_lon=" + end_lon +
        ", end_fov=" + end_fov +
        ", duration=" + duration +
        ", easing=" + easing +
        "}";
    }
}
