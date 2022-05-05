package com.example.json;

public class Event_json {
    private String e_key;
    private String type;
    private String iframeUrl;
    private String videoUrl;
    private String imageUrl;
    private String jumpUrl;
    private float width;
    private float height;
    private boolean enableClose;
    private float margin;

    public String getE_key() {
        return e_key;
    }

    public void setE_key(String e_key) {
        this.e_key = e_key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIframeUrl() {
        return iframeUrl;
    }

    public void setIframeUrl(String iframeUrl) {
        this.iframeUrl = iframeUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
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

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isEnableClose() {
        return enableClose;
    }

    public void setEnableClose(boolean enableClose) {
        this.enableClose = enableClose;
    }

    public float getMargin() {
        return margin;
    }

    public void setMargin(float margin) {
        this.margin = margin;
    }

    public boolean isVideoMuted() {
        return videoMuted;
    }

    public void setVideoMuted(boolean videoMuted) {
        this.videoMuted = videoMuted;
    }

    public boolean isEnableMask() {
        return enableMask;
    }

    public void setEnableMask(boolean enableMask) {
        this.enableMask = enableMask;
    }




    public Event_json(String type, String iframeUrl, String videoUrl, String imageUrl, String jumpUrl, float width, float height, boolean enableClose, float margin, boolean videoMuted, boolean enableMask) {

        this.type = type;
        this.iframeUrl = iframeUrl;
        this.videoUrl = videoUrl;
        this.imageUrl = imageUrl;
        this.jumpUrl = jumpUrl;
        this.width = width;
        this.height = height;
        this.enableClose = enableClose;
        this.margin = margin;
        this.videoMuted = videoMuted;
        this.enableMask = enableMask;
    }

    private boolean videoMuted;
    private boolean enableMask;
}
