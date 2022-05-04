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
public class Qjmy_model implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String model_key;

    private Integer id_scene;

    private String obj_url;

    private String texture;

    private String mode_format;

    private Integer scale;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel_key() {
        return model_key;
    }

    public void setModel_key(String model_key) {
        this.model_key = model_key;
    }

    public Integer getId_scene() {
        return id_scene;
    }

    public void setId_scene(Integer id_scene) {
        this.id_scene = id_scene;
    }

    public String getObj_url() {
        return obj_url;
    }

    public void setObj_url(String obj_url) {
        this.obj_url = obj_url;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getMode_format() {
        return mode_format;
    }

    public void setMode_format(String mode_format) {
        this.mode_format = mode_format;
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
        ", model_key=" + model_key +
        ", id_scene=" + id_scene +
        ", obj_url=" + obj_url +
        ", texture=" + texture +
        ", mode_format=" + mode_format +
        ", scale=" + scale +
        "}";
    }
}
