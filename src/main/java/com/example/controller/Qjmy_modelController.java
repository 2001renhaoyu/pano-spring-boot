package com.example.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.entity.Qjmy_model;
import com.example.mapper.Qjmy_modelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 郝星然
 * @since 2022-05-04
 */
@Controller
@RequestMapping("/qjmy_model")
public class Qjmy_modelController {
    @Autowired
    private Qjmy_modelMapper qjmyModelMapper;

    @RequestMapping("/model")
    public JSONObject getjson(){
        JSONObject json=new JSONObject();
        List<Qjmy_model> modelList=qjmyModelMapper.selectList(null);
        for(Qjmy_model qjmyModel:modelList){
            json.put("id",qjmyModel.getId());
            json.put("model_key",qjmyModel.getModel_key());
            json.put("id_scene",qjmyModel.getId_scene());
            json.put("obj_url",qjmyModel.getObj_url());
            json.put("texture",qjmyModel.getTexture());
            json.put("mode_format",qjmyModel.getMode_format());
            json.put("scale",qjmyModel.getScale());
        }
        return json;
    }


}

