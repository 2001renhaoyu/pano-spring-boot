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
public class Qjmy_model implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer id_scene;

    private String objUrl;

    private String texture;

    private String modeFormat;

    private Integer scale;


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

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    @Override
    public String toString() {
        return "Qjmy_model{" +
        "id=" + id +
        ", id_scene=" + id_scene +
        ", objUrl=" + objUrl +
        ", texture=" + texture +
        ", modeFormat=" + modeFormat +
        ", scale=" + scale +
        "}";
    }
}
