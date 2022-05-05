package com.example.json;

public class Guide_json {

    private String key;
    public Guide_start start;
    public Guide_end end;
    public int duration;
    public String easing;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    public Guide_json(String key, Guide_start start, Guide_end end, int duration, String easing) {
        this.key = key;
        this.start = start;
        this.end = end;
        this.duration = duration;
        this.easing = easing;
    }


}
