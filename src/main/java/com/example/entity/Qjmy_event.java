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
public class Qjmy_event implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer id_scene;

    private String e_key;

    private String type;

    private String image_url;

    private String jump_url;

    private String video_url;

    private String iframe_url;

    private Float width;

    private Float height;

    private Boolean enable_close;

    private Float margin;

    private Boolean video_muted;

    private Boolean enable_mask;


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

    public String gete_key() {
        return e_key;
    }

    public void sete_key(String e_key) {
        this.e_key = e_key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getJump_url() {
        return jump_url;
    }

    public void setJump_url(String jump_url) {
        this.jump_url = jump_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getIframe_url() {
        return iframe_url;
    }

    public void setIframe_url(String iframe_url) {
        this.iframe_url = iframe_url;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Boolean getEnable_close() {
        return enable_close;
    }

    public void setEnable_close(Boolean enable_close) {
        this.enable_close = enable_close;
    }

    public Float getMargin() {
        return margin;
    }

    public void setMargin(Float margin) {
        this.margin = margin;
    }

    public Boolean getVideo_muted() {
        return video_muted;
    }

    public void setVideo_muted(Boolean video_muted) {
        this.video_muted = video_muted;
    }

    public Boolean getEnable_mask() {
        return enable_mask;
    }

    public void setEnable_mask(Boolean enable_mask) {
        this.enable_mask = enable_mask;
    }

    @Override
    public String toString() {
        return "Qjmy_event{" +
        "id=" + id +
        ", id_scene=" + id_scene +
        ", e_key=" + e_key +
        ", type=" + type +
        ", image_url=" + image_url +
        ", jump_url=" + jump_url +
        ", video_url=" + video_url +
        ", iframe_url=" + iframe_url +
        ", width=" + width +
        ", height=" + height +
        ", enable_close=" + enable_close +
        ", margin=" + margin +
        ", video_muted=" + video_muted +
        ", enable_mask=" + enable_mask +
        "}";
    }
}
