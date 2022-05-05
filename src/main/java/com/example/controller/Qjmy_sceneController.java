package com.example.controller;


import com.example.entity.*;
import com.example.json.Pic;
import com.example.json.Scene_json;
import com.example.mapper.*;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 郝星然
 * @since 2022-05-04
 */
@RestController
@RequestMapping("/qjmy_scene")
public class Qjmy_sceneController {
    @Autowired
    private Qjmy_sceneMapper qjmySceneMapper;

    @Autowired
    private Qjmy_modelMapper qjmyModelMapper;

    @Autowired
    private Qjmy_particle_effectMapper qjmyParticleEffectMapper;

    @Autowired
    private Qjmy_res_urlsMapper qjmyResUrlsMapper;

    @Autowired
    private Qjmy_hot_spotMapper qjmyHotSpotMapper;

    @Autowired
    private Qjmy_eventMapper qjmyEventMapper;

    @Autowired
    private Qjmy_auto_guideMapper qjmyAutoGuideMapper;
    private com.example.json.Pic Pic;


    @RequestMapping("/scene")
    public Scene_json getjson(){
        Qjmy_scene qjmy_scene=qjmySceneMapper.selectById(0);
        Scene_json scene_json=new Scene_json(qjmy_scene.getCamera_fov(), qjmy_scene.getAuto_rotate_speed(), qjmy_scene.getEnable_auto_rotate(),qjmy_scene.getVolume(),qjmy_scene.getMuted());
        List<Qjmy_model> modelList=qjmyModelMapper.selectList(null);
        List<Qjmy_particle_effect> particle_effects=qjmyParticleEffectMapper.selectList(null);
        List<Qjmy_res_urls>res_urls=qjmyResUrlsMapper.selectList(null);
        List<Qjmy_hot_spot>hot_spots=qjmyHotSpotMapper.selectList(null);
        List<Qjmy_event>events=qjmyEventMapper.selectList(null);
        List<Qjmy_auto_guide>guides=qjmyAutoGuideMapper.selectList(null);

        for(Qjmy_model qjmyModel : modelList){
            scene_json.addModel(qjmyModel);
        }
        for(Qjmy_hot_spot qjmyHotSpot:hot_spots){
            scene_json.addHot(qjmyHotSpot);
        }
        for (Qjmy_event qjmy_event:events){
            scene_json.addEvent(qjmy_event);
        }
        for(Qjmy_particle_effect qjmyParticleEffect:particle_effects){
            scene_json.addParticle(qjmyParticleEffect);
        }
        for(Qjmy_res_urls qjmyResUrls:res_urls){
            scene_json.addUrl(qjmyResUrls);
        }
        for(Qjmy_auto_guide qjmy_auto_guide:guides){
            scene_json.addGuide(qjmy_auto_guide);
        }



        return scene_json;
    }

    @RequestMapping("/getpic")
    public Pic getPic(){
        Pic pic=new Pic();
        List<Qjmy_scene> scenes=qjmySceneMapper.selectList(null);
        for (Qjmy_scene qjmy_scene:scenes){
            Pic.pic=qjmy_scene.getId_res_urls();
        }
        
        return Pic;

    }



}

