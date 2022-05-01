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
public class Qjmy_event implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer id_scene;

    private String type;

    private String imageUrl;

    private String jumpUrl;

    private String videoUrl;

    private String iframeUrl;

    private Float width;

    private Float height;

    private Boolean enableClose;

    private Float margin;

    private Boolean videoMuted;

    private Boolean enableMask;


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getIframeUrl() {
        return iframeUrl;
    }

    public void setIframeUrl(String iframeUrl) {
        this.iframeUrl = iframeUrl;
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

    public Boolean getEnableClose() {
        return enableClose;
    }

    public void setEnableClose(Boolean enableClose) {
        this.enableClose = enableClose;
    }

    public Float getMargin() {
        return margin;
    }

    public void setMargin(Float margin) {
        this.margin = margin;
    }

    public Boolean getVideoMuted() {
        return videoMuted;
    }

    public void setVideoMuted(Boolean videoMuted) {
        this.videoMuted = videoMuted;
    }

    public Boolean getEnableMask() {
        return enableMask;
    }

    public void setEnableMask(Boolean enableMask) {
        this.enableMask = enableMask;
    }

    @Override
    public String toString() {
        return "Qjmy_event{" +
        "id=" + id +
        ", id_scene=" + id_scene +
        ", type=" + type +
        ", imageUrl=" + imageUrl +
        ", jumpUrl=" + jumpUrl +
        ", videoUrl=" + videoUrl +
        ", iframeUrl=" + iframeUrl +
        ", width=" + width +
        ", height=" + height +
        ", enableClose=" + enableClose +
        ", margin=" + margin +
        ", videoMuted=" + videoMuted +
        ", enableMask=" + enableMask +
        "}";
    }
}
