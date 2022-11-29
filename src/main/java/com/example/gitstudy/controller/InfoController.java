package com.example.gitstudy.controller;

import com.example.gitstudy.dao.InfoMapper;
import com.example.gitstudy.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class InfoController {

    @Autowired
    InfoService service;

    @Autowired
    InfoMapper mapper;
    @GetMapping("/hello")
    @ResponseBody
    public Map<String,Object> queryInfo(){
        Map<String, Object> map = mapper.queryInfo();
        return service.queryInfo();
    }
}
