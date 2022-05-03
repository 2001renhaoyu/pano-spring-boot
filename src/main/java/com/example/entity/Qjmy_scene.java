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
public class Qjmy_scene implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Float camera_fov;

    private Float auto_rotate_speed;

    private Integer enable_auto_rotate;

    private Float volume;

    private Integer muted;

    private Integer id_res_urls;

    private Integer id_particle_effect;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getCamera_fov() {
        return camera_fov;
    }

    public void setCamera_fov(Float camera_fov) {
        this.camera_fov = camera_fov;
    }

    public Float getAuto_rotate_speed() {
        return auto_rotate_speed;
    }

    public void setAuto_rotate_speed(Float auto_rotate_speed) {
        this.auto_rotate_speed = auto_rotate_speed;
    }

    public Integer getEnable_auto_rotate() {
        return enable_auto_rotate;
    }

    public void setEnable_auto_rotate(Integer enable_auto_rotate) {
        this.enable_auto_rotate = enable_auto_rotate;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Integer getMuted() {
        return muted;
    }

    public void setMuted(Integer muted) {
        this.muted = muted;
    }

    public Integer getId_res_urls() {
        return id_res_urls;
    }

    public void setId_res_urls(Integer id_res_urls) {
        this.id_res_urls = id_res_urls;
    }

    public Integer getId_particle_effect() {
        return id_particle_effect;
    }

    public void setId_particle_effect(Integer id_particle_effect) {
        this.id_particle_effect = id_particle_effect;
    }

    @Override
    public String toString() {
        return "Qjmy_scene{" +
        "id=" + id +
        ", camera_fov=" + camera_fov +
        ", auto_rotate_speed=" + auto_rotate_speed +
        ", enable_auto_rotate=" + enable_auto_rotate +
        ", volume=" + volume +
        ", muted=" + muted +
        ", id_res_urls=" + id_res_urls +
        ", id_particle_effect=" + id_particle_effect +
        "}";
    }
}
