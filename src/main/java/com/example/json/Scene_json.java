package com.example.json;
import com.example.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scene_json {
    public float camera_fov;
    public float auto_rotate_speed;
    public boolean enable_auto_rotate;
    public float volume;
    public boolean muted;

    public Scene_json(float camera_fov, float auto_rotate_speed, boolean enable_auto_rotate, float volume, boolean muted) {
        this.camera_fov = camera_fov;
        this.auto_rotate_speed = auto_rotate_speed;
        this.enable_auto_rotate = enable_auto_rotate;
        this.volume = volume;
        this.muted = muted;
    }


    private Model_json model_json;
    private Spot_json spot_json;
    private Event_json event_json;
    public List<List<Object>> model_list=new ArrayList<>();
    public Map<String, Object> particle_effect=new HashMap<String, Object>();
    public List<res_urls_json>res_urls=new ArrayList<>();
    public List<List<Object>> hot_spot =new ArrayList<>();
    public List<List<Object>> event_list=new ArrayList<>();
    public List<Guide_json> auto_guide_list=new ArrayList<>();

    public void addModel(Qjmy_model qjmyModel) {
        List<Object> temp=new ArrayList<Object>();
        temp.add(qjmyModel.getModel_key());
        model_json=new Model_json(qjmyModel.getObj_url(), qjmyModel.getTexture(), qjmyModel.getMode_format(), qjmyModel.getScale());
        temp.add(model_json);
        model_list.add(temp);
    }

    public void addHot(Qjmy_hot_spot qjmyHotSpot){
        List<Object> temp=new ArrayList<Object>();
        temp.add(qjmyHotSpot.getHs_key());
        spot_json=new Spot_json(qjmyHotSpot.getHs_key(), qjmyHotSpot.getLat(), qjmyHotSpot.getLon(), qjmyHotSpot.getAnimate(), qjmyHotSpot.getName(), qjmyHotSpot.getTitle(), qjmyHotSpot.getRes_url(), qjmyHotSpot.getImg_url(), qjmyHotSpot.getImg_height(), qjmyHotSpot.getImg_width());
        temp.add(spot_json);
        hot_spot.add(temp);
    }

    public void addEvent(Qjmy_event qjmyEvent){
        List<Object> temp=new ArrayList<Object>();
        temp.add(qjmyEvent.gete_key());
        event_json=new Event_json(qjmyEvent.getType(), qjmyEvent.getIframe_url(), qjmyEvent.getVideo_url(), qjmyEvent.getImage_url(), qjmyEvent.getJump_url(), qjmyEvent.getWidth(), qjmyEvent.getHeight(), qjmyEvent.getEnable_close(), qjmyEvent.getMargin(), qjmyEvent.getVideo_muted(),qjmyEvent.getEnable_mask());
        temp.add(event_json);
        event_list.add(temp);
    }

    public void addParticle(Qjmy_particle_effect qjmyParticleEffect){
        particle_effect.put("url",qjmyParticleEffect.getUrl());
        particle_effect.put("num",qjmyParticleEffect.getNum());
        particle_effect.put("range",qjmyParticleEffect.getPrange());
        particle_effect.put("color",qjmyParticleEffect.getColor());
        particle_effect.put("sizeAttenuation",qjmyParticleEffect.getSize_attenuation());
    }

    public void addUrl(Qjmy_res_urls qjmy_res_urls){
        res_urls_json urlsJson=new res_urls_json(qjmy_res_urls.getType(), qjmy_res_urls.getRes_url(), qjmy_res_urls.getPanoramic_type(), qjmy_res_urls.getRadius());
        res_urls.add(urlsJson);
    }

    public void addGuide(Qjmy_auto_guide qjmy_auto_guide){
        Guide_start guide_start=new Guide_start(qjmy_auto_guide.getStart_lat(), qjmy_auto_guide.getEnd_lon(), qjmy_auto_guide.getEnd_fov());
        Guide_end guide_end=new Guide_end(qjmy_auto_guide.getEnd_lat(), qjmy_auto_guide.getEnd_lon(), qjmy_auto_guide.getEnd_fov());
        Guide_json guide_json=new Guide_json(qjmy_auto_guide.getAg_key(), guide_start,guide_end, qjmy_auto_guide.getDuration(), qjmy_auto_guide.getEasing());
        auto_guide_list.add(guide_json);
    }


}
