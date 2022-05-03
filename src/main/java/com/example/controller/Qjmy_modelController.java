package com.example.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.entity.Qjmy_model;
import com.example.mapper.Qjmy_modelMapper;
import com.example.service.impl.Qjmy_modelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 郝欣然
 * @since 2022-05-03
 */
@Controller
@RequestMapping("/qjmy_model")
public class Qjmy_modelController {
    @Autowired
    private Qjmy_modelMapper qjmyModelMapper;



    @RequestMapping("/model")
    public JSONObject getjson(){
        JSONObject object=new JSONObject();
        List<Qjmy_model> list=qjmyModelMapper.selectList(null);
        list.forEach(System.out::println);
        for(Qjmy_model qjmyModel : list){
            object.put("id",qjmyModel.getId());
            object.put("key",qjmyModel.getKey());
            object.put("id_scene",qjmyModel.getId_scene());
            object.put("objUrl",qjmyModel.getObjUrl());
            object.put("texture",qjmyModel.getTexture());
            object.put("modeFormat",qjmyModel.getModeFormat());
            object.put("scale",qjmyModel.getScale());
        }
        return object;
    }

}

